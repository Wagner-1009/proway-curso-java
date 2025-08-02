/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.granacerta.repositories;
import br.com.proway.granacerta.bean.Conta;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 11795
 */
public interface ContaRepositoryInterface {
   void adicionar (Conta conta) throws SQLException;
   List<Conta> obterTodos() throws SQLException;
   Conta obterPorId(int id) throws SQLException;
   void editar(Conta conta) throws SQLException;
   void apagar (int id) throws SQLException;
}
