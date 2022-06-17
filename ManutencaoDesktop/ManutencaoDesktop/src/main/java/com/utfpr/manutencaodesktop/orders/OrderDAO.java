/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.orders;

import com.utfpr.manutencaodesktop.utils.ManutencaoDAO;
import static com.utfpr.manutencaodesktop.utils.ManutencaoDAO.ALTERACAO;
import static com.utfpr.manutencaodesktop.utils.ManutencaoDAO.EXCLUSAO;
import static com.utfpr.manutencaodesktop.utils.ManutencaoDAO.INCLUSAO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author leona
 */
public class OrderDAO extends ManutencaoDAO {
    
    public Order order;
    
    public OrderDAO() {
        super();
        this.order = new Order();
    }
    
    public boolean localizar() {
        sql = "select * from order where idOrder = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, Integer.toString(order.getIdOrder()));
            resultSet = statement.executeQuery();
            resultSet.first();
            order.setIdOrder(resultSet.getInt(1));
            order.setDescriptionOrder(resultSet.getString(2));
            order.setBeginDateOrder(resultSet.getDate(3));
            order.setFinalDateOrder(resultSet.getDate(4));
            order.setFinishedOrder(resultSet.getBoolean(5));
            order.setMachineId(resultSet.getInt(6));
            order.setMachineId(resultSet.getInt(7));
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }
    
    public ArrayList<Order> localizarFiltro(boolean isFinished) {
        sql = "select * from `manutencao`.order where finishedOrder = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setBoolean(1, isFinished);
            resultSet = statement.executeQuery();
            ArrayList<Order> orders = new ArrayList<>();
            while (resultSet.next()) {
                Order newOrder = new Order(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getDate(3), 
                        resultSet.getDate(4), 
                        resultSet.getBoolean(5), 
                        resultSet.getInt(6), 
                        resultSet.getInt(7));
                orders.add(newOrder);
            }
            return orders;
        } catch (SQLException erro) {
            System.out.println(erro);
            return null;
        }
    }
    
    public ArrayList<Order> localizarTodas() {
        sql = "select * from `manutencao`.order";
        try {
            statement = connect.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            ArrayList<Order> orders = new ArrayList<>();
            while (resultSet.next()) {
                Order newOrder = new Order(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getDate(3), 
                        resultSet.getDate(4), 
                        resultSet.getBoolean(5), 
                        resultSet.getInt(6), 
                        resultSet.getInt(7));
                orders.add(newOrder);
            }
            return orders;
        } catch (SQLException erro) {
            System.out.println(erro);
            return null;
        }
    }
    
    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into `manutencao`.order (descriptionOrder, beginDateOrder, finalDateOrder, finishedOrder, mantainerId, machineId) values (?,?,?,?,?,?)";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, order.getDescriptionOrder());
                statement.setDate(2, order.getBeginDateOrder());
                statement.setDate(3, order.getFinalDateOrder());
                statement.setBoolean(4, order.isFinishedOrder());
                statement.setInt(5, order.getMantainerId());
                statement.setInt(6, order.getMachineId());
            } else if (operacao == ALTERACAO) {
                sql = "update `manutencao`.order set descriptionOrder = ?, beginDateOrder = ?, finalDateOrder = ?, finishedOrder = ?, mantainerId = ?, machineId = ? where idOrder = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, order.getDescriptionOrder());
                statement.setDate(2, order.getBeginDateOrder());
                statement.setDate(3, order.getFinalDateOrder());
                statement.setBoolean(4, order.isFinishedOrder());
                statement.setInt(5, order.getMantainerId());
                statement.setInt(6, order.getMachineId());
                statement.setInt(7, order.getIdOrder());
            } else if (operacao == EXCLUSAO) {
                sql = "delete from `manutencao`.order where idOrder = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setInt(1, order.getIdOrder());
            }
            if (statement.executeUpdate() == 0) {
                men = "Falha na operacao!";
            }
        } catch (SQLException erro) {
            men = "Falha na operacao!";
        }
        return men;
    }

    public ArrayList<Order> localizarAtrasadas() {
        Date date = new Date();
        System.out.println(date);
        java.sql.Date dateSQL = new java.sql.Date(date.getTime());
        
        sql = "select * from `manutencao`.order where finalDateOrder < ? and finishedOrder = 0";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setDate(1, dateSQL);
            resultSet = statement.executeQuery();
            ArrayList<Order> orders = new ArrayList<>();
            while (resultSet.next()) {
                Order newOrder = new Order(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getDate(3), 
                        resultSet.getDate(4), 
                        resultSet.getBoolean(5), 
                        resultSet.getInt(6), 
                        resultSet.getInt(7));
                orders.add(newOrder);
            }
            return orders;
        } catch (SQLException erro) {
            System.out.println(erro);
            return null;
        }
    }
    
}
