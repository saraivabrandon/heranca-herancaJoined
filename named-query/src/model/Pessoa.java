/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.buscarPorId", query = "SELECT p FROM Pessoa p WHERE p.id = :id"),
    @NamedQuery(name = "Pessoa.buscarPorNome", query = "SELECT p FROM Pessoa p WHERE p.nome LIKE :nome"),
    @NamedQuery(name = "Pessoa.buscarPorSalario", query = "SELECT p FROM Pessoa p WHERE p.salario > :salario")
})
public class Pessoa implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "data_nascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNAscimento;
    
    @Column(name = "salario", precision = 8, scale = 2, nullable = false)
    private BigDecimal salario;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNAscimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNAscimento = dataNAscimento;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNAscimento() {
        return dataNAscimento;
    }

    public void setDataNAscimento(Date dataNAscimento) {
        this.dataNAscimento = dataNAscimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
}
