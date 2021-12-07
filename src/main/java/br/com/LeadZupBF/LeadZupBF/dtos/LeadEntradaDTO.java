package br.com.LeadZupBF.LeadZupBF.dtos;

import br.com.LeadZupBF.LeadZupBF.produto.Produto;
import jdk.dynalink.linker.LinkerServices;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class LeadEntradaDTO {

    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String nome;

    private List<Produto> produtosEntrada;

    public LeadEntradaDTO() {

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

    public List<Produto> getProdutosEntrada() {
        return produtosEntrada;
    }

    public void setProdutosEntrada(List<Produto> produtosEntrada) {
        this.produtosEntrada = produtosEntrada;
    }
}
