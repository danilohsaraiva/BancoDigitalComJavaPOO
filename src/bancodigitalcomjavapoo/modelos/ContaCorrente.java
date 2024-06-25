package bancodigitalcomjavapoo.modelos;

/**
 *
 * @author Danilo Saraiva
 */
public class ContaCorrente extends Conta {
    private double taxa;
    private double tafifa;
    private Cliente cliente;

    public ContaCorrente(double taxa, double tafifa, String numeroConta, String digitoConta, String numeroAgencia, String digitoAgencia, double saldoConta) {
        super(numeroConta, digitoConta, numeroAgencia, digitoAgencia, saldoConta);
        this.taxa = taxa;
        this.tafifa = tafifa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTafifa() {
        return tafifa;
    }

    public void setTafifa(double tafifa) {
        this.tafifa = tafifa;
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
