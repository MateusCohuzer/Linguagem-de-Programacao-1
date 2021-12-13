/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Mateus CohuzEr
 */
class Pessoa {
    private String cpf;
    private String nome;
    private double altura;
    private double peso;
    private double imc;
    private String situacaoImc;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, double altura, double peso, double imc, String situacaoImc) {
        this.cpf = cpf;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.situacaoImc = situacaoImc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getSituacaoImc() {
        return situacaoImc;
    }

    public void setSituacaoImc(String situacaoImc) {
        this.situacaoImc = situacaoImc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", imc=" + imc + ", situacaoImc=" + situacaoImc + '}';
    }

}