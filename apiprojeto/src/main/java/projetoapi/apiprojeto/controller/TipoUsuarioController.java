package projetoapi.apiprojeto.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoapi.apiprojeto.model.TipoUsuario;
import projetoapi.apiprojeto.repository.TipoUsuarioRepository;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping(value ="/TipoUsuario")   
public class TipoUsuarioController {


    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;
    
    
    @PostMapping
    private TipoUsuario criarNovoTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
        return tipoUsuarioRepository.save(tipoUsuario);


        

    }
    @GetMapping
    public List<TipoUsuario> obterTipoPeloId(){
        return tipoUsuarioRepository.findAll();
        
    }
    @GetMapping(value = "/{id}")
    public Optional <TipoUsuario> obterTipoPeloId(@PathVariable(value = "id")Long id){
        return tipoUsuarioRepository.findById(id);


    }
    @DeleteMapping(value = "/{id}")
    public String deletarTiposPeloId(@PathVariable(value = "id") Long id){
        tipoUsuarioRepository.deleteById(id);
        return "Tipo Deletado com sucesso";
    }
    @PutMapping
    public  TipoUsuario atualizarTipo(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
   
        
    
    }

    
    


    

    }

