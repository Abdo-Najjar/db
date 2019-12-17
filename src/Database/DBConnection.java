/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abdo
 */
public class DBConnection {
    
    private static DBConnection connect;
    private final String url;
    private final String uname;
    private final String pw;
    private Connection con;
    private final String db;
    private final String unicode ;

    private DBConnection() {
         unicode = Querys.UNICODE;
        db = Querys.DATABASE;
        url = "jdbc:mysql://" + Querys.HOST + "/" + db + unicode;
        uname = Querys.USER;
        pw = Querys.PASSWORD;

        
        
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pw);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static DBConnection getConnect() {
        if (connect == null) {
            connect = new DBConnection();
        }
        return connect;
    }

    public Connection getConnection() {
        return con;
    }
 
}
