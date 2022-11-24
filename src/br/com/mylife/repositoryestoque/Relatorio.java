package br.com.mylife.repositoryestoque;


import java.util.List;

public class Relatorio <T>{


    public void criaRelatorio (T t) {

        System.out.println("******** Relatório total de medicamentos em estoque ********" );
        System.out.println(t);
    }



    public void criaRelatorioTotal(List<MedicamentosRepository> medRepository){

    }
}
