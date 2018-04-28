
package valemobi_teste_back;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.Random;


public class start {
    static int initialValue = 1;
    static int endValue = 2000;
    public static void main(String[] args) throws SQLException {
        DAO d = new DAO();
        String nameHandler = "usuario";
        Random r = new Random();
        for (int i = 0; i < 3000; i++) {
            double valor = initialValue + (r.nextDouble() * (endValue - initialValue));
            BigDecimal valorDecimal = new BigDecimal(valor).setScale(2, RoundingMode.UP);
            Cadastro c = new Cadastro("30303030303", nameHandler + i, valorDecimal.doubleValue());
            d.salvar(c);
        }
    }
}
