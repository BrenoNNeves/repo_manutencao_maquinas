/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.manutencaodesktop.orders;

import java.sql.Date;

/**
 *
 * @author leona
 */
public class Order {

    private int idOrder;
    private String descriptionOrder;
    private Date beginDateOrder;
    private boolean finishedOrder;
    private int mantainerId;
    private int machineId;

    public Order(int idOrder, String descriptionOrder, Date beginDateOrder, boolean finishedOrder, int mantainerId, int machineId) {
        this.idOrder = idOrder;
        this.descriptionOrder = descriptionOrder;
        this.beginDateOrder = beginDateOrder;
        this.finishedOrder = finishedOrder;
        this.mantainerId = mantainerId;
        this.machineId = machineId;
    }
    
    public Order() {
        idOrder = 0;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getDescriptionOrder() {
        return descriptionOrder;
    }

    public void setDescriptionOrder(String descriptionOrder) {
        this.descriptionOrder = descriptionOrder;
    }

    public Date getBeginDateOrder() {
        return beginDateOrder;
    }

    public void setBeginDateOrder(Date beginDateOrder) {
        this.beginDateOrder = beginDateOrder;
    }

    public boolean isFinishedOrder() {
        return finishedOrder;
    }

    public void setFinishedOrder(boolean finishedOrder) {
        this.finishedOrder = finishedOrder;
    }

    public int getMantainerId() {
        return mantainerId;
    }

    public void setMantainerId(int mantainerId) {
        this.mantainerId = mantainerId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
    
    

    @Override
    public String toString() {
        return descriptionOrder;
    }
    
    
    
}
