package br.com.fiap.globalsolution.bean;

import java.util.List;

public class DesastreNatural {

    //Atributos da classe
    private String nomeDesastre;

    private String descricao;

    private List<String> itensEssenciais;

    public DesastreNatural(String nomeDesastre, String descricao, List<String> itensEssenciais) {
        this.nomeDesastre = nomeDesastre;
        this.descricao = descricao;
        this.itensEssenciais = itensEssenciais;
    }

    public String getNomeDesastre() {
        return nomeDesastre;
    }

    public void setNomeDesastre(String nomeDesastre) {
        this.nomeDesastre = nomeDesastre;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getItensEssenciais() {
        return itensEssenciais;
    }

    public void setItensEssenciais(List<String> itensEssenciais) {
        this.itensEssenciais = itensEssenciais;
    }
}
