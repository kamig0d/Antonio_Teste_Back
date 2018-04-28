
package valemobi_teste_back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {
    static Connection conn;
    public static Connection GetDerbyConnection() throws SQLException{
        try{
            if(conn == null){
                
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Teste_V", "root", "1234");
                System.out.println("connected to database");
                
            }
            return conn;
        }catch(SQLException e){
         
            throw e;
            
        }
        
    }
    
    
}
