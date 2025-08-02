/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.bean;

/**
 *
 * @author wagne
 */
public class Conta {
    private int id;
    private String nome;
    private int tipo;
    private double saldo;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double Saldo){
        this.saldo = saldo;
    }
}

/*
        Criar classe Conta na package bean com os seguintes atributos:
        - id int, tipo String, nome String, saldo double
        Na classe InstanciarObjetos dentro do main, após o JOptionPane.showMessageDialog 
        Instanciar 3 objetos de Conta para os seguintes bancos e definir valor para os atributos (id, nome, tipo e saldo)
        - Objeto 1 criar como contaViacredi
        - Objeto 2 criar como contaItau
        - Objeto 3 criar como contaSantander

        Exemplo de tipos de Conta: Poupança, Salário
        */
