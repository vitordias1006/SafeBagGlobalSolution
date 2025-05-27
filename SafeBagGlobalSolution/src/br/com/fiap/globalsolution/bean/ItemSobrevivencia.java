package br.com.fiap.globalsolution.bean;

public class ItemSobrevivencia {

    //Atributos da classe
    private String nomeItem;

    private String descricaoItem;

    private String categoriaItem;

    private double pesoItem;

    public ItemSobrevivencia(String nomeItem, String descricaoItem, String categoriaItem, double pesoItem) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.categoriaItem = categoriaItem;
        this.pesoItem = pesoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getCategoriaItem() {
        return categoriaItem;
    }

    public void setCategoriaItem(String categoriaItem) {
        this.categoriaItem = categoriaItem;
    }

    public double getPesoItem() {
        return pesoItem;
    }

    public void setPesoItem(double pesoItem) {
        this.pesoItem = pesoItem;
    }
}
