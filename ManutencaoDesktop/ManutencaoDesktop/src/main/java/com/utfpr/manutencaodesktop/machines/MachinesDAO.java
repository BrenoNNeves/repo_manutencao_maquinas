/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.machines;

import com.utfpr.manutencaodesktop.Connect;
import com.utfpr.manutencaodesktop.utils.ManutencaoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class MachinesDAO extends ManutencaoDAO {

    public Machine machine;

    public MachinesDAO() {
        super();
        machine = new Machine();
    }

    public boolean localizar() {
        sql = "select * from machine where idMachine = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, Integer.toString(machine.getIdMachine()));
            resultSet = statement.executeQuery();
            resultSet.first();
            machine.setIdMachine(resultSet.getInt(1));
            machine.setNameMachine(resultSet.getString(2));
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }

    public ArrayList<Machine> localizarTodos() {
        sql = "select * from machine";
        try {
            statement = connect.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            ArrayList<Machine> machines = new ArrayList<>();
            while (resultSet.next()) {
                Machine newMachine = new Machine(resultSet.getInt("idMachine"), resultSet.getString("nameMachine"));
                machines.add(newMachine);
            }
            return machines;
        } catch (SQLException erro) {
            return null;
        }
    }

    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into machine (nameMachine) values (?)";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, machine.getNameMachine());
            } else if (operacao == ALTERACAO) {
                sql = "update machine set nameMachine = ? where idMachine = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, machine.getNameMachine());
                statement.setInt(2, machine.getIdMachine());
            } else if (operacao == EXCLUSAO) {
                sql = "delete from machine where idMachine = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setInt(1, machine.getIdMachine());
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
