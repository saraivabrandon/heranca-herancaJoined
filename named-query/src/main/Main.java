/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.FuncionarioDAO;
import dao.PessoaDAO;
import java.math.BigDecimal;
import java.util.Date;
import model.Funcionario;
import model.Pessoa;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        for(int i=0; i<10; i++) {
            Pessoa p = new Pessoa("pessoa " + i, new Date(), new BigDecimal(1000 * i));
            pessoaDAO.inserir(p);
        }
        
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(4);
        
        System.out.println(pessoaRetornada);
        
//        Funcionario f1 = new Funcionario();
//        f1.setNome("Maria");
//        f1.setSalario(new BigDecimal(50000));
//        
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//        funcionarioDAO.inserir(f1);
    }
}
