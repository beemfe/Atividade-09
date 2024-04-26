package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import atividade08.ContaBancaria;
import atividade08.ContaEspecial;
import atividade08.ContaPoupanca;
import lombok.Getter;
import lombok.Setter;

@WebServlet("/contas")
public class DadosContaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ContaBancaria[] contas;

    @Override
    public void init() throws ServletException {
        contas = new ContaBancaria[2];
        contas[0] = new ContaPoupanca("Cliente1", 1, 1000, 10);
        contas[1] = new ContaEspecial("Cliente2", 2, 2000, 500);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("dadosconta", contas);
        request.getRequestDispatcher("dadosconta.jsp").forward(request, response);
    }
}
