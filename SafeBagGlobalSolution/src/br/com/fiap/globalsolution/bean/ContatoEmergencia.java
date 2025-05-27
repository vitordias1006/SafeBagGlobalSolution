package br.com.fiap.globalsolution.bean;

public class ContatoEmergencia {

    //Atributos da classe
    private String nome;

    private String telefone;

    private String relacao; 

    public ContatoEmergencia(String nome, String telefone, String relacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.relacao = relacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRelacao() {
        return relacao;
    }

    public void setRelacao(String relacao) {
        this.relacao = relacao;
    }

    // Metodo criado apenas para confirmar contato de emergência
    public void exibirContato(){
        System.out.printf("Nome: %s\n Telefone: %s\n Relação: %s");
    }
}
