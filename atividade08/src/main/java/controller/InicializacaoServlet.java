package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import atividade08.ContaEspecial;
import atividade08.ContaPoupanca;

@WebServlet("/inicializacao")
public class InicializacaoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContaPoupanca poupanca = new ContaPoupanca("Cliente Poupança", 1, 1000, 1);
        ContaEspecial especial = new ContaEspecial("Cliente Especial", 2, 2000, 500);
        
        request.setAttribute("poupanca", poupanca);
        request.setAttribute("especial", especial);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
