/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import java.util.Date;
import mx.itson.catrina.enums.TypeTransactions;

/**
 *
 * @author vagui
 */
public class Transaction {
    private Date date = new Date();
    private String description = new String();
    private double amount = 0.00;
    private TypeTransactions type;

    public Transaction() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TypeTransactions getType() {
        return type;
    }

    public void setType(TypeTransactions type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
