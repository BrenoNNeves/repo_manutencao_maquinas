/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.mantainer;

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
public class MantainerDAO extends ManutencaoDAO {

    public Mantainer mantainer;

    public MantainerDAO() {
        super();
        mantainer = new Mantainer();
    }

    public boolean localizar() {
        sql = "select * from mantainer where idMantainer = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, Integer.toString(mantainer.getIdMantainer()));
            resultSet = statement.executeQuery();
            resultSet.first();
            mantainer.setIdMantainer(resultSet.getInt(1));
            mantainer.setNomeMantainer(resultSet.getString(2));
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }

    public ArrayList<Mantainer> localizarTodos() {
        sql = "select * from mantainer";
        try {
            statement = connect.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            ArrayList<Mantainer> mantainers = new ArrayList<Mantainer>();
            while (resultSet.next()) {
                Mantainer newMantainer = new Mantainer(resultSet.getInt("idMantainer"), resultSet.getString("nameMantainer"));
                mantainers.add(newMantainer);
            }
            return mantainers;
        } catch (SQLException erro) {
            return null;
        }
    }

    public String atualizar(int operacao) {
        men = "Operacao realizada com sucesso!";
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into mantainer (nameMantainer) values (?)";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, mantainer.getNomeMantainer());
            } else if (operacao == ALTERACAO) {
                sql = "update mantainer set nameMantainer = ? where idMantainer = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setString(1, mantainer.getNomeMantainer());
                statement.setInt(2, mantainer.getIdMantainer());
            } else if (operacao == EXCLUSAO) {
                sql = "delete from mantainer where idMantainer = ?";
                statement = connect.connection.prepareStatement(sql);
                statement.setInt(1, mantainer.getIdMantainer());
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
