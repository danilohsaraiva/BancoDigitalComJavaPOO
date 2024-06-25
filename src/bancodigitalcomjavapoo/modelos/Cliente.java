package bancodigitalcomjavapoo.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Saraiva
 */
public class Cliente { 
    List<Conta> listaContas;
    String nome;
    String cpf;

    public Cliente() {
        listaContas = new ArrayList<>();
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
