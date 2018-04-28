
package valemobi_teste_back;

import java.sql.SQLException;


public class start {
    public static void main(String[] args) throws SQLException {
        cadastro c = new cadastro();
        c.setCpf_cnpj("30303030303");
        c.setName("Paloma");
        c.setTotal(555.37);
        
        dao d = new dao();
        d.salvar(c);
    }
}
