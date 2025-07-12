/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.bean;

/**
 *
 * @author wagne
 */
public class Proprietario {

    private int id;
    private String email;
    private String nome;
    private String cpf;
    private int senha;

    //get permite obter o valor privado
    //set permite atribuir valor a um atributo privado
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
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
}
        


