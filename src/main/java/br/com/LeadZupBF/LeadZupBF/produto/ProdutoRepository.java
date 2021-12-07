package br.com.LeadZupBF.LeadZupBF.produto;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto, Long>{
    boolean existsByNome(String nome);//metodo que verifica se o nome do produto já existe// está fazendo uma query no
                                        // banco de dados



}
