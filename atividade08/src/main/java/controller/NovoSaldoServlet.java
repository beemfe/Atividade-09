package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import atividade08.ContaPoupanca;

@WebServlet("/novosaldo")
public class NovoSaldoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContaPoupanca poupanca = (ContaPoupanca) request.getAttribute("poupanca");
        float taxaRendimento = Float.parseFloat(request.getParameter("taxaRendimento"));
        poupanca.calcularNovoSaldo(taxaRendimento);
        
        request.setAttribute("mensagem", "Novo saldo calculado com sucesso!");
        request.getRequestDispatcher("novosaldo.jsp").forward(request, response);
    }
}