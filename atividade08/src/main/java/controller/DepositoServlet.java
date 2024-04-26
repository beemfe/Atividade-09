package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deposito")
public class DepositoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipoConta = request.getParameter("tipoConta");
        float valor = Float.parseFloat(request.getParameter("valor"));
        
        if (tipoConta.equals("poupanca")) {
        } else if (tipoConta.equals("especial")) {
        }
        
        request.setAttribute("mensagem", "Depósito realizado com sucesso!");
        request.getRequestDispatcher("deposito.jsp").forward(request, response);
    }
}