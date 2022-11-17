package br.com.mylife.farmacia;

import java.util.ArrayList;

public class Medicamentos {

    private String nome;
    private String validade;
    private Integer quantidade;
    private String laboratorio;




    public Medicamentos(String nome, String validade,  Integer quantidade, String laboratorio) {
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
        this.laboratorio = laboratorio;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
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
