/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.FuncionarioDAO;
import dao.PessoaDAO;
import java.math.BigDecimal;
import model.Funcionario;
import model.Pessoa;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("joão");
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserir(p1);
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setSalario(new BigDecimal(50000));
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(f1);
    }
}
