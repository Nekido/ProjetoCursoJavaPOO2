package br.com.mylife.farmacia;

import java.util.Date;

public class Medicamentos {

    private String nome;
    private int validade;

    private Integer quantidade;
    private String laboratorio;




    public Medicamentos(String nome, int validade,  Integer quantidade, String laboratorio) {
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.laboratorio = laboratorio;
    }

//QUERO QUE O PROGRAMA SOME OS MEDICAMENTS INDIVIDUALMENTE E NA TOTALIDADE

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getLaboratorio(){
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "Medicamentos{" +
                "nome='" + nome + '\'' +
                ", validade='" + validade + '\'' +
                ", quantidade=" + quantidade +
                ", laboratorio=" + laboratorio +
                '}';
    }
}
