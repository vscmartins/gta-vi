package com.dt2.gtavi.entity;

import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String marca;
    private String tipo;
    private String imagem;
    private String descricao;

    public Carro(int id, String nome, String marca, String tipo, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Carro(){}

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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