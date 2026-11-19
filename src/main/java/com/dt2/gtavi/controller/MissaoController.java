package com.dt2.gtavi.controller;

import com.dt2.gtavi.entity.Missao;
import com.dt2.gtavi.repository.MissaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/missoes")
public class MissaoController {

    private final MissaoRepository repository;
    public MissaoController(MissaoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarMissao(@RequestBody Missao missao){
        try {
            return "Dados foi salvo" + repository.save(missao);

        }catch (Exception e){
            return  "Dados invalidos";
        }
    }

    @GetMapping
    public List<Missao> mostrar(){
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
    public void atualizar(@PathVariable int id, @RequestBody Missao m){
        Missao missao = repository.getReferenceById(id);
        missao.setNome(m.getNome());
        missao.setLocal(m.getLocal());
        missao.setDificuldade(m.getDificuldade());
        missao.setImagem(m.getImagem());
        missao.setDescricao(m.getDescricao());
        repository.save(missao);
    }






}