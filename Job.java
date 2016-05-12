/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;


public class Job {
    private String nome, prestador, descricao, tipo;
    private boolean atendimento;
    private double preco, avaliacao;
    
    public Job(){
        
    }
    
    public Job(String nome, String prestador, String tipo, 
            double preco, String descricao, double avaliacao, boolean atendimento){
        super();
        this.nome = nome;
        this.prestador = prestador;
        this.tipo = tipo;
        this.preco = preco;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.atendimento = atendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtendimento() {
        return atendimento;
    }

    public void setAtendimento(boolean atendimento) {
        this.atendimento = atendimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return ("Serviço: " + nome + "\tPrestador: " + prestador + "\tTipo de Serviço: " + tipo + 
                "\tValor: " + preco + "\tDescrição: " + descricao + "\tQualidade: " + avaliacao + "\tFinal de Semana: " + atendimento);
    }
}
