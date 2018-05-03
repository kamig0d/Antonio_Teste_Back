
package valemobi_teste_back;


public class Cadastro {
    public int id_customer;
    public String cpf_cnpj;
    public String name;
    public boolean active;
    public double total;

    public Cadastro(int id_customer, String cpf_cnpj, String name, boolean active, double total) {
        this.id_customer = id_customer;
        this.cpf_cnpj = cpf_cnpj;
        this.name = name;
        this.active = active;
        this.total = total;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    

    @java.lang.Override
    public java.lang.String toString() {
        return "cadastro{" +
                "cpf_cnpj='" + cpf_cnpj + '\'' +
                ", name='" + name + '\'' +
                ", active='" +active + '\'' +
                ", total=" + total +
                '}';
    }
}
