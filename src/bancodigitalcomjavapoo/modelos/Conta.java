package bancodigitalcomjavapoo.modelos;

/**
 *
 * @author Danilo
 */
public abstract class Conta {
    private String numeroConta;
    private String digitoConta;
    private String numeroAgencia;
    private String digitoAgencia;
    private double saldoConta;

    public Conta(String numeroConta, String digitoConta, String numeroAgencia, String digitoAgencia, double saldoConta) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.numeroAgencia = numeroAgencia;
        this.digitoAgencia = digitoAgencia;
        this.saldoConta = saldoConta;
    }
    
    public abstract void transferencia(double valor);
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
}
