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
public class Table {

    private long id;
    private String name;
    private boolean isBooked;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     * @return 
     */
    public Table setId(long id) {
        this.id = id;
        return Table.this;
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
    public Table setName(String name) {
        this.name = name;
        
        return Table.this;
    }

    /**
     * @return the isBooked
     */
    public boolean isIsBooked() {
        return isBooked;
    }

    /**
     * @param isBooked the isBooked to set
     * @return 
     */
    public Table setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
        return Table.this;
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", name=" + name + ", isBooked=" + isBooked + '}';
    }
    
    
    
}
