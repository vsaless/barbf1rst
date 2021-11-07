package com.example.demo.controller;

import com.example.demo.entity.ContatoEntity;
import com.example.demo.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ContatoController {
    private ContatoRepository repository;

    @Autowired
    public ContatoController(ContatoRepository repository){
        this.repository=repository;
    }

    @GetMapping("/contato/{id}")
    public ResponseEntity<ContatoEntity> getcontato(@PathVariable("id") Integer id){
      ContatoEntity contato = repository.findById(id).get();
      return  ResponseEntity.ok(contato);
    }

    @PostMapping("/contato")
    public ResponseEntity<String> salvarNobanco(@RequestBody ContatoEntity entity){

        if (entity.getNome()==null && entity.getNome()== "")
        {
          return ResponseEntity.ok("{}");


        }
       Integer quantidadeDeCpf = repository.countAllByCpf(entity.getCpf());

       if (quantidadeDeCpf<=0 || entity.getId() != null) {

           this.repository.save(entity);
       }


        return  ResponseEntity.ok("{}");    }

    @GetMapping("/contato")
    public ResponseEntity<List<ContatoEntity>> getAllContato(){
        List<ContatoEntity> contato = repository.findAll();
        return  ResponseEntity.ok(contato);
    }




    @DeleteMapping("/contato/{id}")
    public ResponseEntity<String> deletarNobanco(@PathVariable("id") Integer id){
         repository.deleteById(id);
        return  ResponseEntity.ok("ok");
    }



}
