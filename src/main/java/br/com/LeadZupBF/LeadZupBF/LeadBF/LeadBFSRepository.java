package br.com.LeadZupBF.LeadZupBF.LeadBF;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeadBFSRepository  extends CrudRepository <LeadZupBF, String> {
    List<LeadZupBF> findAllByProdutosNome(String nomeDoProduto);//query de busca de lead pelo nome do produto
}
