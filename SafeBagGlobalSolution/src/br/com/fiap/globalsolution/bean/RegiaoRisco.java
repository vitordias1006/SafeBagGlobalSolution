package br.com.fiap.globalsolution.bean;

public class RegiaoRisco {

    //Atributos da classe
    private String pais;

    private String estado;

    private String cidade;

    private String desastresComuns;

    private int nivelRisco;

    private String observacoes;

    public RegiaoRisco(String pais, String estado, String cidade, String desastresComuns, int nivelRisco, String observacoes) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.desastresComuns = desastresComuns;
        this.nivelRisco = nivelRisco;
        this.observacoes = observacoes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDesastresComuns() {
        return desastresComuns;
    }

    public void setDesastresComuns(String desastresComuns) {
        this.desastresComuns = desastresComuns;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //Metodo para calcular o risco da área, se o risco for alto ela será uma área de preferência
    public String calcularRisco(int nivelRisco, String observacoes, String desastresComuns){
        if (nivelRisco < 3){
            return "Na sua região o risco é abaixo, reforços seram encaminhados assim que possível.";
        }
        return "Área de risco detectada, entre em contato com alguém, os reforços serão encaminhados o mais rápido possível.";
    }
}
