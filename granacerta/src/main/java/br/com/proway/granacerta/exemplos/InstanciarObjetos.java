/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.exemplos;

import br.com.proway.granacerta.bean.Conta;
import br.com.proway.granacerta.bean.Proprietario;
import javax.swing.JOptionPane;

/**
 *
 * @author wagne
 */
public class InstanciarObjetos {
    public static void main(String[] args) {
        Proprietario joao = new Proprietario(); 
        joao.setNome("joao");
        joao.setEmail("joaodasilva@gmail.com");
        joao.setId(1232);
        joao.setCpf("123.123.123-13");
        joao.setSenha(23123);
        
        Proprietario maria = new Proprietario();
        maria.setCpf(";123.123.123-23");
        maria.setId(123);
        maria.setEmail("mariaer@gmail.com"); 
        maria.setSenha(3435);
        maria.setNome("maria rosaura");
        
        joao.setNome("joao toledo");
        
        JOptionPane.showMessageDialog(null, 
        "id: " + joao.getId() +
        "\ncpf: " + joao.getCpf() + 
        "\nNome: " + joao.getNome() +
        "\nEmail: " + joao.getEmail() + 
        "\nNome: " + maria.getNome() +
        "\nCPF: " + maria.getCpf() + 
        "\nEmail: " + maria.getEmail());
       
        Conta contaItau = new Conta();
        contaItau.setId(123);
        contaItau.setNome("Pedro Balestrin");
        contaItau.setSaldo(123.234);
        contaItau.setTipo("Corrente");
        
        Conta contaViacred = new Conta();
        contaViacred.setId(121);
        contaViacred.setNome("Wagner Luiz");
        contaViacred.setSaldo(351.542);
        contaViacred.setTipo("Poupança");
        
        Conta contaSantander = new Conta();
        contaSantander.setId(213);
        contaSantander.setNome("Bruno Ricardo");
        contaSantander.setSaldo(124.215);
        contaSantander.setTipo("Poupança");
        
        
        
    }
}



