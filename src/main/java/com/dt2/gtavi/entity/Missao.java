package com.dt2.gtavi.entity;

import jakarta.persistence.*;

@Entity
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String local;
    private  String dificuldade;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Missao(int id, String nome, String local, String dificuldade, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Missao(String nome, String local, String dificuldade, String imagem, String descricao) {
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Missao(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
