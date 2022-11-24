package br.com.mylife.repositoryestoque;


import java.util.List;

public class Relatorio <T>{
    T obj;

    public void criaRelatorio (T obj) {
        this.obj = obj;
        System.out.println(" Relatório total de medicamentos em estoque:" + obj);
    }






    public void criaRelatorioTotal(List<MedicamentosRepository> medRepository){

    }
}
