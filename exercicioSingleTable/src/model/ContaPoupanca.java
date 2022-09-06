/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "conta_poupanca")
public class ContaPoupanca extends ContaCorrente{
    @Column(name = "dia_de_aniversario", nullable = false)
    private Date diaDeAniversario;

    public Date getDiaDeAniversario() {
        return diaDeAniversario;
    }

    public void setDiaDeAniversario(Date diaDeAniversario) {
        this.diaDeAniversario = diaDeAniversario;
    }
    
}
