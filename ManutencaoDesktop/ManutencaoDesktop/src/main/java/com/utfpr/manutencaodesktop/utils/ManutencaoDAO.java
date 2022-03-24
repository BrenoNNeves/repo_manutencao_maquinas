/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.utils;

import com.utfpr.manutencaodesktop.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author leona
 */
public class ManutencaoDAO {
    public Connect connect;
    public PreparedStatement statement;
    public ResultSet resultSet;
    public String men, sql;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ManutencaoDAO() {
        connect = new Connect();
        connect.Connect();
    }
    
    
}
