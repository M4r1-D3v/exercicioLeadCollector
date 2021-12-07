package br.com.LeadZupBF.LeadZupBF.LeadBF;

import br.com.LeadZupBF.LeadZupBF.produto.Produto;
import br.com.LeadZupBF.LeadZupBF.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadBFService {
    @Autowired
    private LeadBFSRepository leadBFSRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public LeadZupBF salvarLead(LeadZupBF leadZupBF){


        return leadBFSRepository.save(leadZupBF);
    }

    public List<LeadZupBF> buscarLeadPorProduto(String nomeProduto){
        return leadBFSRepository.findAllByProdutosNome(nomeProduto);
    }


}
