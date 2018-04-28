
package valemobi_teste_back;


public class Cadastro {
    
    public String cpf_cnpj;
    public String name;
    public double total;

    public Cadastro(String cpf_cnpj, String name, double total) {
        this.cpf_cnpj = cpf_cnpj;
        this.name = name;
        this.total = total;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "cadastro{" +
                "cpf_cnpj='" + cpf_cnpj + '\'' +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
