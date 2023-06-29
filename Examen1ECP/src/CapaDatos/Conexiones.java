package CapaDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author tonyM
 */
public class Conexiones {
    
    Connection con = null;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String usuario = "root";
    private static String password = "BWnaTlKxtEVG9kpW33xj";
    private static String url = "jdbc:mysql://containers-us-west-56.railway.app:6867?zeroDateTimeBehavior=CONVERT_TO_NULL";
//    private static String driver = "com.mysql.cj.jdbc.Driver";
//    private static String usuario = "root";
//    private static String password = "UZgXbVtuZHm4gdf6EO0g";
//    private static String url = "jdbc:mysql://containers-us-west-148.railway.app:6678/_PERSONAS?zeroDateTimeBehavior=CONVERT_TO_NULL";
//    
    static
    {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Project", 0);
        }
    
    }
    
    public Connection getConn()
    {
        try {
            con =  DriverManager.getConnection(url,usuario,password);
        } catch (Exception e) {
            System.out.println("Error al conectarnos a la base de datos");
            con = null;
        }
    return con;
    }
    
    
    
}
