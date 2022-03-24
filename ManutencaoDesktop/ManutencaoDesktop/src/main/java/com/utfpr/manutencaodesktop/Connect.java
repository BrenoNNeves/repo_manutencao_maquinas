/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Connect {

    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/manutencao";
    public Connection connection = null;

    public boolean Connect() {
        try {
            Class.forName(DRIVER);
            this.connection = DriverManager.getConnection(URL, "root", "2536");
            System.out.println("Conexao Realizada com sucesso!");
            return true;
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado! " + erro.toString());
            return false;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão! " + erro.toString());
            return false;
        }
    }

    public void close() {
        try {
            this.connection.close();
            System.out.println("Desconectado!");
        } catch (SQLException erro) {
            System.out.println(erro.toString());
        }
    }
}
