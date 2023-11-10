/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author Victor Rocha
 * Esta es la clase de la cuenta bancaria donde se llaman todas las demas entidades
 * para que de esta misma mande llamar los valores de cada una de los atributos
 * y de esto pueda mostrarlo en jFrame
 * 
 */
public class Account {
    private String account = new String();
    private String clabe = new String();
    private String currency= new String();
    private Customer customer;
    private List<Transaction> transactions;

    /*/*
    Aqui se deserealiza el json que tiene todos los datos mostrados
    Esta línea define un método público llamado deserealize que toma 
    una cadena json como argumento y devuelve un objeto Account.
    */

    
    public Account deserealize(String json) {
    Account account = new Account();
    try{
        /*/*
        En esta línea, se utiliza la biblioteca Gson para 
        deserializar la cadena JSON json en un objeto de tipo Account. 
        */
        account = new Gson().fromJson(json, Account.class);
    }catch(Exception ex){
        System.err.println("Ocurrio un error: "+ex.getMessage());
    }
    /*/*
    Finalmente, independientemente de si se produce un error o no, 
    el método devuelve el objeto account. Si no se produce un 
    error, este objeto contendrá los datos deserializados de la cadena JSON.
    */
    return account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }


    
}
