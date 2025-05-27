package br.com.fiap.globalsolution.bean;

import java.util.List;

public class Pessoa {

    //Atributos da classe
    private String nome;

    private int idade;

    private String genero;

    private List<String> condicoesMedicas;

    public Pessoa(String nome, int idade, String genero, List<String> condicoesMedicas) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.condicoesMedicas = condicoesMedicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getCondicoesMedicas() {
        return condicoesMedicas;
    }

    public void setCondicoesMedicas(List<String> condicoesMedicas) {
        this.condicoesMedicas = condicoesMedicas;
    }

    //Metodo de cadastro para poder acessar o site
    public String cadastro(String nome, String email, String senha){
        return "Cadastro realizado com sucesso";
    }
}
