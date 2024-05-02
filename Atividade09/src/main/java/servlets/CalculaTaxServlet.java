package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Property;
import strategy.*;

@SuppressWarnings("serial")
@WebServlet("/calculate")
public class CalculaTaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double areaTotal = Double.parseDouble(request.getParameter("areaTotal"));
        int numComodos = Integer.parseInt(request.getParameter("numComodos"));
        int numQuartos = Integer.parseInt(request.getParameter("numQuartos"));
        double areaGaragem = Double.parseDouble(request.getParameter("areaGaragem"));
        int idadeImovel = Integer.parseInt(request.getParameter("idadeImovel"));
        String city = request.getParameter("city");

        Property property = new Property();
        property.setAreaTotal(areaTotal);
        property.setNumComodos(numComodos);
        property.setNumQuartos(numQuartos);
        property.setAreaGaragem(areaGaragem);
        property.setIdadeImovel(idadeImovel);

        TaxCalculationStrategy strategy;
        switch (city) {
            case "SaoPaulo":
                strategy = new SaoPauloTaxStrategy();
                break;
            case "BeloHorizonte":
                strategy = new BeloHorizonteTaxStrategy();
                break;
            case "PortoAlegre":
                strategy = new PortoAlegreTaxStrategy();
                break;
            case "Curitiba":
                strategy = new CuritibaTaxStrategy();
                break;
            default:
                throw new IllegalArgumentException("Cidade inválida");
        }

        double tax = strategy.calculateTax(property);

        request.setAttribute("tax", tax);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
