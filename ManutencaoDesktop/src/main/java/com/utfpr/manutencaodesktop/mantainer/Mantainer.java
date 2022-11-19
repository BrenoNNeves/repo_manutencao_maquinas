/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.mantainer;

/**
 *
 * @author leona
 */
public class Mantainer {
    private int idMantainer;
    private String nomeMantainer;

    public Mantainer(int idMantainer, String nomeMantainer) {
        this.idMantainer = idMantainer;
        this.nomeMantainer = nomeMantainer;
    }

    public Mantainer() {
        idMantainer = 0;
        nomeMantainer = "";
    }

    public int getIdMantainer() {
        return idMantainer;
    }

    public void setIdMantainer(int idMantainer) {
        this.idMantainer = idMantainer;
    }

    public String getNomeMantainer() {
        return nomeMantainer;
    }

    public void setNomeMantainer(String nomeMantainer) {
        this.nomeMantainer = nomeMantainer;
    }

    @Override
    public String toString() {
        return nomeMantainer;
    }
    
    
    
}
