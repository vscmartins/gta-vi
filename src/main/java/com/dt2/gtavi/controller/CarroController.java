package com.dt2.gtavi.controller;

import com.dt2.gtavi.entity.Carro;
import com.dt2.gtavi.repository.CarroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class CarroController {

    private final CarroRepository repository;
    public CarroController(CarroRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarCarro(@RequestBody Carro carro){
        try{
            return "Carro foi adicionado no sistema" + repository.save(carro);
        }
        catch (Exception e){
            return "Dados invalidos";
        }
    }

    @GetMapping
    public List<Carro> mostrar(){
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
    public void atualizar(@PathVariable int id, @RequestBody Carro c ){
        Carro carro = repository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setMarca(c.getMarca());
        carro.setTipo(c.getTipo());
        carro.setImagem(c.getImagem());
        carro.setDescricao(c.getDescricao());
        repository.save(carro);

    }

}