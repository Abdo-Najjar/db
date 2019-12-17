/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBConnection;
import Database.DbUtils;
import Database.Querys;
import Subjects.Male;
import Subjects.Person;
import Subjects.Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author abdo
 */
public class OwnerTransactions {

    private final Connection con;

    public OwnerTransactions() {

        con = DBConnection.getConnect().getConnection();
    }

    protected Integer createCasher(Person aPerson) {
        try (PreparedStatement ps = con.prepareCall(Querys.CREATE_CASHER)) {
            ps.setString(1, aPerson.getName());
            ps.setString(2, aPerson.getPassword());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
     protected Integer createTable(Table aTable) {
        try (PreparedStatement ps = con.prepareCall(Querys.CREATE_TABLE)) {
            ps.setString(1, aTable.getName());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    

    protected Integer createMale(Male aMale) {
        try (PreparedStatement ps = con.prepareCall(Querys.CREATE_MALE)) {
            ps.setString(1, aMale.getName());
            ps.setDouble(2, aMale.getBalance());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    protected void getAllCashers(JTable table) {

        try {
            PreparedStatement st = con.prepareCall(Querys.GET_CASHERS);
            st.executeQuery();
            ResultSet rs = st.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    protected void getAllMales(JTable table) {

        try {
            PreparedStatement st = con.prepareCall(Querys.GET_MALES);
            st.executeQuery();
            ResultSet rs = st.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    protected void getAllTables(JTable table) {

        try {
            PreparedStatement st = con.prepareCall(Querys.GET_TABLES);
            st.executeQuery();
            ResultSet rs = st.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    protected Integer deleteCasher(long aCasherId) {

        try (PreparedStatement ps = con.prepareCall(Querys.DELETE_CASHER)) {

            ps.setLong(1, aCasherId);

            return ps.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }

        return null;
    }

    
    protected Integer deleteMale(long aMaleId) {

        try (PreparedStatement ps = con.prepareCall(Querys.DELETE_MALE)) {

            ps.setLong(1, aMaleId);

            return ps.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }

        return null;
    }

     protected Integer deleteTable(long aTableId) {

        try (PreparedStatement ps = con.prepareCall(Querys.DELETE_TABLE)) {

            ps.setLong(1, aTableId);

            return ps.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }

        return null;
    }

    
}
