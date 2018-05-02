
package valemobi_teste_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAO {
    public void salvar(Cadastro c) throws SQLException{
        Connection conn = null;
        conn = Connector.GetDerbyConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO TB_CUSTOMER_ACCOUNT (CPF_CNPJ, NM_CUSTOMER, IS_ACTIVE, VL_TOTAL) VALUES (?,?,?,?)");
        
        ps.setString(1, c.getCpf_cnpj());
        ps.setString(2, c.getName());
        ps.setBoolean(3, c.active);
        ps.setDouble(4, c.getTotal());
        
        try{
            ps.execute();
            System.out.println("Data successfully inserted");
        }catch(SQLException e){
            System.out.println("Data was not inserted. Error "+ e);
            throw e;
        }
        
    }
}
