package br.com.LeadZupBF.LeadZupBF.Controller;

import br.com.LeadZupBF.LeadZupBF.LeadBF.LeadBFService;
import br.com.LeadZupBF.LeadZupBF.LeadBF.LeadZupBF;
import br.com.LeadZupBF.LeadZupBF.dtos.LeadEntradaDTO;
import br.com.LeadZupBF.LeadZupBF.dtos.ProdutoEntradaDTO;
import br.com.LeadZupBF.LeadZupBF.produto.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadBFController {

    @Autowired
    private LeadBFService leadBFService;
    @Autowired
    private ModelMapper modelMapper;

    @PutMapping
    public LeadEntradaDTO cadastrarLead(@RequestBody  LeadEntradaDTO leadEntradaDTO){
        LeadZupBF leadZupBF = modelMapper.map(leadEntradaDTO,LeadZupBF.class);

        leadZupBF = leadBFService.salvarLead(leadZupBF);
        return modelMapper.map(leadZupBF,LeadEntradaDTO.class);

    }


    public List<LeadZupBF>buscarLead(@RequestParam String nomeProduto){

        return leadBFService.buscarLeadPorProduto(nomeProduto);
    }

}
