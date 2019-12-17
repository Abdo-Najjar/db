/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBConnection;
import Database.Querys;
import Subjects.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author abdo
 */
public class Authentication {

    
    public static Person person;
    
    private final DBConnection connect;
    private final Connection con;

    public Authentication() {
        connect = DBConnection.getConnect();
        
        con = connect.getConnection();
    }

    protected boolean authenManager(String aName, String aPassword) {
        try (PreparedStatement ps = con.prepareCall(Querys.AUTH_ONWER)) {
            ps.setString(1, aName);
            String password;
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                password = rs.getString(1);
            }
            if (aPassword.equals(password)) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    protected boolean authenCasher(String aName, String aPassword) {
        try (PreparedStatement ps = con.prepareCall(Querys.AUTH_CASHER)) {
            ps.setString(1, aName);
            String password;
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                password = rs.getString(1);
            }
            if (aPassword.equals(password)) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    protected boolean authenCustomer(String aName, String aPassword) {
        try (PreparedStatement ps = con.prepareCall(Querys.AUTH_CUSTOMER)) {
            ps.setString(1, aName);
            String password;
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                password = rs.getString(1);
            }
            if (aPassword.equals(password)) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }


}
