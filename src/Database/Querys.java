/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author abdo
 */
public interface Querys {

    static String HOST = "localhost";
    static String UNICODE = "?useUnicode=yes&characterEncoding=UTF-8";
    static String DATABASE = "db";
    static String USER = "root";
    static String PASSWORD = "";
    
    //Authintaction querys
    public String AUTH_ONWER = "select password from users where uname = ? and type = '0' ";
    public String AUTH_CASHER = "select password from users where uname = ? and type =  '1' ";
    public String AUTH_CUSTOMER = "select password from users where uname = ? and type = '2' ";
    
   //Cashers querys
    public String CREATE_CASHER = "insert into users set uname = ? , password = ? , type = '1' " ;
    public String GET_CASHERS = "Select id as ID, uname as Username from users where type = '1' ";
    public String DELETE_CASHER = "Delete from users where id = ?";
    
     //Males querys
    public String CREATE_MALE = "insert into males set name = ? , balance = ? " ;
    public String GET_MALES = "Select id as ID, name as Name , balance as Balance  from males ";
    public String DELETE_MALE = "Delete from males where id = ?";
    
    //Tables querys
    public String CREATE_TABLE = "insert into tables set name = ?" ;
    public String GET_TABLES = "SELECT id as ID , name as Name FROM `tables` ";
    public String DELETE_TABLE = "Delete from tables where id = ?";
    
    
}
