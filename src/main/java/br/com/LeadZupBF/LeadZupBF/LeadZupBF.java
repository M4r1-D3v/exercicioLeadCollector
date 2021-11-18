package br.com.LeadZupBF.LeadZupBF;

import br.com.LeadZupBF.LeadZupBF.produto.Produto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "leadBF")
public class LeadZupBF {

@Id
private String email;
private String nome;
private List<Produto>produtos;

    public LeadZupBF() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
