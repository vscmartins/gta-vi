package com.dt2.gtavi.controller;


import com.dt2.gtavi.entity.Personagem;
import com.dt2.gtavi.repository.PersonagemRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemRepository repository;

    public PersonagemController(PersonagemRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarPersonagem(@RequestBody Personagem lucas) {
        try {
            return "Salvo com sucesso" + repository.save(lucas);
        } catch (Exception e) {
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Personagem> mostrar() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id) {
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Personagem p) {
        Personagem personagem = repository.getReferenceById(id);

        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setImagem(p.getImagem());
        personagem.setDescricao(p.getDescricao());
        repository.save(personagem);
    }
}
