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
import java.util.ArrayList;

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
            order.setFinishedOrder(resultSet.getBoolean(4));
            order.setMachineId(resultSet.getInt(5));
            order.setMachineId(resultSet.getInt(6));
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }
    
    public ArrayList<Order> localizarTodos(boolean isFinished) {
        sql = "select * from `manutencao`.order where finishedOrder = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setBoolean(1, isFinished);
            resultSet = statement.executeQuery();
            ArrayList<Order> orders = new ArrayList<>();
            while (resultSet.next()) {
                Order newOrder = new Order(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getBoolean(4), resultSet.getInt(5), resultSet.getInt(6));
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
                sql = "insert into `manutencao`.order (descriptionOrder, beginDateOrder, finishedOrder, mantainerId, machineId) values (?,?,?,?,?)";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, order.getDescriptionOrder());
                statement.setDate(2, order.getBeginDateOrder());
                statement.setBoolean(3, order.isFinishedOrder());
                statement.setInt(4, order.getMantainerId());
                statement.setInt(5, order.getMachineId());
            } else if (operacao == ALTERACAO) {
                sql = "update `manutencao`.order set descriptionOrder = ?, beginDateOrder = ?, finishedOrder = ?, mantainerId = ?, machineId = ? where idOrder = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, order.getDescriptionOrder());
                statement.setDate(2, order.getBeginDateOrder());
                statement.setBoolean(3, order.isFinishedOrder());
                statement.setInt(4, order.getMantainerId());
                statement.setInt(5, order.getMachineId());
                statement.setInt(6, order.getIdOrder());
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
    
}
