/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Pessoa;

/**
 *
 * @author aluno
 */
public class PessoaDAO extends AbstractDAO<Pessoa>{
   public Pessoa buscarPorId(long id){
       EntityManager em = getEntityManager();
       TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId", Pessoa.class);
       query.setParameter("id", id);
       
       return query.getSingleResult();
   }
   
   public List<Pessoa> buscarPorSalario(BigDecimal salario){
       EntityManager em = getEntityManager();
       TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario", Pessoa.class);
       query.setParameter("salario", salario);
       
       return query.getResultList();
   }
   
   public List<Pessoa> buscarPorNome(String nome){
       EntityManager em = getEntityManager();
       TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome", Pessoa.class);
       query.setParameter("nome", "%" + nome + "%");
       
       return query.getResultList();
   }
}
