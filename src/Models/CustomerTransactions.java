
package Models;

import Database.DBConnection;
import Database.Querys;
import Subjects.Male;
import Subjects.Order;
import Subjects.Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdo
 */
public class CustomerTransactions {
 
    private final Connection  con;

    public CustomerTransactions() {
        
        con = DBConnection.getConnect().getConnection();
        
    }
    
    
    
    protected List<Male> getAllMales() {
        List<Male> males;
        try (PreparedStatement ps = con.prepareCall(Querys.GET_MALES)) {
            try (ResultSet rs = ps.executeQuery()) {
                males = new ArrayList<>();
                while (rs.next()) {
                    males.add(new Male().setName(rs.getString("Name")).setBalance(rs.getDouble("Balance")).setId(rs.getInt("ID")));
                }
            }

            return males;
        } catch (SQLException ex) {

        }
        return null;
    }
    
    
      protected List<Table> getAllTables() {
        List<Table> tables;
        try (PreparedStatement ps = con.prepareCall(Querys.GET_TABLES)) {
            try (ResultSet rs = ps.executeQuery()) {
                tables = new ArrayList<>();
                while (rs.next()) {
                    tables.add(new Table().setName(rs.getString("Name")).setId(rs.getLong("ID")));
                }
            }

            return tables;
        } catch (SQLException ex) {

        }
        return null;
    }
      
      
      
      protected Integer createOrder( Order aOrder ){
          
        try(PreparedStatement ps = con.prepareCall(Querys.CREATE_ORDER)) {
            ps.setLong(1, aOrder.getCustomerID());
            ps.setLong(2, aOrder.getMaleID());
            ps.setLong(3, aOrder.getTableID());
            ps.setLong(4, aOrder.getQuantity());
            
            return ps.executeUpdate();
            
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());

        }
            
        return null;
      }
      
     
      protected Long getuser(String aName){
          try(PreparedStatement ps = con.prepareCall(Querys.GET_USER)){

              ps.setString(1, aName);
              ResultSet rs =   ps.executeQuery();
              rs.next();
              return rs.getLong("id");
              
          }catch(SQLException e){
              System.out.println( e.getMessage());
          }
          
          return null;
      }
    
    
}
