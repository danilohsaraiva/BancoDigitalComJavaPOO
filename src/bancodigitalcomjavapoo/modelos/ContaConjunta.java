package bancodigitalcomjavapoo.modelos;

import java.util.List;

/**
 *
 * @author Danilo Saraiva
 */
public class ContaConjunta extends Conta{
        List<Cliente> clientes;

    public ContaConjunta(List<Cliente> clientes, String numeroConta, String digitoConta, String numeroAgencia, String digitoAgencia, double saldoConta) {
        super(numeroConta, digitoConta, numeroAgencia, digitoAgencia, saldoConta);
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void transferencia(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saque(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deposito(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
