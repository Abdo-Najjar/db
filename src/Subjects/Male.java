/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subjects;

/**
 *
 * @author abdo
 */
public class Male {
    private long id;
    private String name;
    private double balance;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return 
     */
    public Male setName(String name) {
        this.name = name;
        
        return this;
        
    }

    /**
     * @return the Balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     * @return 
     */
    public Male setBalance(double balance) {
        this.balance = balance;
        return this;
    }
}
