/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop;

import com.utfpr.manutencaodesktop.utils.ManutencaoDAO;
import java.sql.SQLException;

/**
 *
 * @author leona
 */
public class LoginDAO extends ManutencaoDAO {

    public LoginDAO() {
        super();
    }

    public boolean logar(User userLogin) {
        sql = "select * from user where email = ? and password = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, userLogin.getEmail());
            statement.setString(2, userLogin.getPassword());
            resultSet = statement.executeQuery();
            resultSet.next();
            if(!resultSet.wasNull()) {
                return true;
            }            
            return false;
        } catch (SQLException erro) {
            System.out.println(erro.toString());
            return false;
        } catch (NullPointerException erro) {
            System.out.println(erro.getMessage());
            return false;
        }
    }

}
