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
public class Order {

    private long id;
    private long customerID;
    private long maleID;
    private long tableID;
    private int quantity;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public Order setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * @return the customerID
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public Order setCustomerID(long customerID) {
        this.customerID = customerID;
        return this;
    }

    /**
     * @return the maleID
     */
    public long getMaleID() {
        return maleID;
    }

    /**
     * @param maleID the maleID to set
     */
    public Order setMaleID(long maleID) {
        this.maleID = maleID;
        return this;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public Order setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public long getTableID() {
        return tableID;
    }

    public Order setTableID(long tableID) {
        this.tableID = tableID;
       return Order.this;
    }
    

    
}
