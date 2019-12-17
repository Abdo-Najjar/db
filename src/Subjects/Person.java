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
public class Person {
    private long id;
    private String name;
    private String password;
    private Type type;
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     * @return Person
     */
    public Person setId(long id) {
        this.id = id;
        return Person.this;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return Person
     */
    public Person setName(String name) {
        this.name = name;
        return Person.this;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     * @return Person
     */
    public Person setType(Type type) {
        this.type = type;
        return Person.this;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     * @return Person
     */
    public Person setPassword(String password) {
        this.password = password;
        return Person.this;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", password=" + password + ", type=" + type + '}';
    }
    
    
}
