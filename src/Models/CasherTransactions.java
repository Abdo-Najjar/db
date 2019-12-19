package Models;

import Database.DBConnection;
import Database.DbUtils;
import Database.Querys;
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

        try (PreparedStatement st = con.prepareCall(Querys.GET_ORDERS)) {

            st.executeQuery();

            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            System.out.println(ex);

        }
    }

    
    protected Integer deleteOrder(Long aOrderId) {

        try (PreparedStatement ps = con.prepareCall(Querys.DELETE_ORDER)) {

            ps.setLong(1, aOrderId);

            return ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    
}
