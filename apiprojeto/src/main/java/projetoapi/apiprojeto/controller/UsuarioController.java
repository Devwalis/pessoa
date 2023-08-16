package projetoapi.apiprojeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoapi.apiprojeto.model.Usuario;
import projetoapi.apiprojeto.repository.UsuarioRepository;
@RestController
@RequestMapping( value = "/usuario")


    public class UsuarioController<integer> {

    
@Autowired
 private UsuarioRepository usuarioRepository;
        
 
 
        @GetMapping 
        public List <Usuario> obterUsuario(){
            return usuarioRepository.findAll();

        

        }

        @GetMapping (value = "/{id}")
        public   Optional <Usuario> obterUsuarioPeloId (@PathVariable(value = "id") integer id) {
            return usuarioRepository.findById((Long) id);


            
        }
        @PostMapping
        public Usuario criarNovoUsuario(@RequestBody Usuario usuario) {
            return usuarioRepository.save(usuario);
            
           
        }
        @DeleteMapping(value = "/{id}")
        public String deletarTiposPeloId (@PathVariable(value = "id") long id) {
            usuarioRepository.deleteById(id);
            return "Usuário deletado com sucesso";

        }
        @PutMapping
        public Usuario atualUsuario (@RequestBody Usuario usuario){
            return usuarioRepository.save(usuario);
            

        }
        

        
        }



    

        
       
        
    
  


    


 