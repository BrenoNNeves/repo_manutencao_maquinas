/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.machines;

/**
 *
 * @author leona
 */
public class Machine {

    private int idMachine;
    private String nameMachine;

    public Machine(int idMachine, String nome) {
        this.idMachine = idMachine;
        this.nameMachine = nome;
    }

    public Machine() {
    }

    public int getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    public String getNameMachine() {
        return nameMachine;
    }

    public void setNameMachine(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    @Override
    public String toString() {
        return nameMachine;
    }

    
}
