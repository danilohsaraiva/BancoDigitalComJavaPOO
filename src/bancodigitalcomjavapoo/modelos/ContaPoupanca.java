package bancodigitalcomjavapoo.modelos;

/**
 *
 * @author Danilo Saraiva
 */
public class ContaPoupanca extends Conta{
    private double redimento;
    private Cliente cliente;

    public ContaPoupanca(double redimento, String numeroConta, String digitoConta, String numeroAgencia, String digitoAgencia, double saldoConta) {
        super(numeroConta, digitoConta, numeroAgencia, digitoAgencia, saldoConta);
        this.redimento = redimento;
    }

    public double getRedimento() {
        return redimento;
    }

    public void setRedimento(double redimento) {
        this.redimento = redimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void transferencia(double valor) {
        
    }

    @Override
    public void saque(double valor) {
        
    }

    @Override
    public void deposito(double valor) {
        
    }

    @Override
    public void imprimirExtrato() {
       
    }
    
    
}
