
package valemobi_teste_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class final_result {
    public static void main(String[] args) throws SQLException {
        double media = 0;
        double soma = 0;
        int size = 0;
        int i = 0;
        
        Connection conn = null;
        conn = connection.GetDerbyConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tb_customer_account where vl_total > 560 and id_customer between 1500 and 2700  order by vl_total desc");
        List<Double> valores = new ArrayList<Double>();
        
        while(rs.next()){
            String nome = rs.getString("nm_customer");
            valores.add(rs.getDouble("vl_total"));
            size = valores.size();
            
            
            soma += valores.get(i);
            i++;
            
            System.out.println("NM_CUSTOMER: "+ nome);
            System.out.printf("VL_TOTAL = %.2f\n", valores.get(i-1));
            System.out.println("");
        }
        media = soma/size; 
        System.out.println("");
        System.out.printf("Media = %.2f\n", media);
        
    }
}
