package Oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DBConnection {
	private static Connection myConnection =null;
	
	public static Connection getConnection() throws Exception {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        myConnection =DriverManager.getConnection(url,username,password);
        //System.out.println(connection);
        return myConnection;
}
 }