/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop;

/**
 *
 * @author leona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        Connect connection = new Connect();
        connection.Connect();
    }
    
}
