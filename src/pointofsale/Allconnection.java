package barmanagementsystem.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Allconnection {

    static Connection conn;
    static Statement st;

    public static Connection Allconnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pub", "root", "");
            st = conn.createStatement();
            System.out.println("bar");
            return conn;
        } catch (SQLException e) {
           

            JOptionPane.showMessageDialog(null, "Connection Failed\n" + e.getMessage().concat("\n" 
                    + "Create the database and then\n import the tables to proceed."),
                    "CONNECTION ERROR",JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Class DB Error",
                   JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }
}
