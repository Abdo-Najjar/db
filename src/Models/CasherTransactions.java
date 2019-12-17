/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Database.DBConnection;
import Database.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author abdo
 */
public class CasherTransactions {

    private final Connection con;

    public CasherTransactions() {
        this.con = DBConnection.getConnect().getConnection();
    }
    

    protected void getAllOrders(JTable table) {

        try (PreparedStatement st = con.prepareCall("")) {

            st.executeQuery();

            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            System.out.println(ex);

        }
    }

}
