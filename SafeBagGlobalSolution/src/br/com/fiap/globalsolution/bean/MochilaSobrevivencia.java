package br.com.fiap.globalsolution.bean;

import java.util.ArrayList;
import java.util.List;

public class MochilaSobrevivencia {

    //Atributos da classe
    private Pessoa dono;

    private List<ItemSobrevivencia> itens;

    private double pesoTotal;

    private String tipoDesastre;

    public MochilaSobrevivencia(Pessoa dono, List<ItemSobrevivencia> itens, double pesoTotal, String tipoDesastre) {
        this.dono = dono;
        this.itens = itens;
        this.pesoTotal = pesoTotal;
        this.tipoDesastre = tipoDesastre;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public List<ItemSobrevivencia> getItens() {
        return itens;
    }

    public void setItens(List<ItemSobrevivencia> itens) {
        this.itens = itens;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getTipoDesastre() {
        return tipoDesastre;
    }

    public void setTipoDesastre(String tipoDesastre) {
        this.tipoDesastre = tipoDesastre;
    }

    //Metodo para verificar se tem algum item na lista e criar uma lista de tudo que vai dentro da mochila de sobrevivência
    public void adicionaNaMochila(ItemSobrevivencia item){
        if (itens == null){
            itens = new ArrayList<>();
        }
        itens.add(item);
    }
}
