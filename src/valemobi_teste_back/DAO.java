
package valemobi_teste_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAO {
    public void salvar(Cadastro c) throws SQLException{
        Connection conn = null;
        conn = Connector.GetDerbyConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO TB_CUSTOMER_ACCOUNT (ID_CUSTOMER, CPF_CNPJ, NM_CUSTOMER, IS_ACTIVE, VL_TOTAL) VALUES (?,?,?,?,?)");
        int i = 0;
        ps.setInt(++i, c.getId_customer());
        ps.setString(++i, c.getCpf_cnpj());
        ps.setString(++i, c.getName());
        ps.setBoolean(++i, c.isActive());
        ps.setDouble(++i, c.getTotal());
       
        
        try{
            ps.execute();
            System.out.println("Data successfully inserted");
        }catch(SQLException e){
            System.out.println("Data was not inserted. Error "+ e);
            throw e;
        }
        
    }
}
