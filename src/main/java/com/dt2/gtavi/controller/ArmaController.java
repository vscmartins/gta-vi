package com.dt2.gtavi.controller;

import com.dt2.gtavi.entity.Arma;
import com.dt2.gtavi.repository.ArmaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
public class ArmaController {

    private final ArmaRepository repository;

    public ArmaController(ArmaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarArma(@RequestBody Arma arminha){
        try{
            repository.save(arminha);
            return "Salvo com sucesso";
        }
        catch (Exception e){
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Arma> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Arma a ) {
        Arma arma = repository.getReferenceById(id);

        arma.setNome(a.getNome());
        arma.setFabricante(a.getFabricante());
        arma.setDescricao(a.getDescricao());
        arma.setImagem(a.getImagem());
        arma.setCategoria(a.getCategoria());
        repository.save(arma);
    }
}

