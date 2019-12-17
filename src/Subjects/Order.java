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
    public void setId(long id) {
        this.id = id;
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
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
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
    public void setMaleID(long maleID) {
        this.maleID = maleID;
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
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    
}
