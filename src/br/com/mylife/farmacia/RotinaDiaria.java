package br.com.mylife.farmacia;


import br.com.mylife.repositoryestoque.MedicamentosRepository;
import br.com.mylife.repositoryestoque.Relatorio;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static br.com.mylife.farmacia.TipoRemedioEnum.ANTIBIOTICO;
import static br.com.mylife.farmacia.TipoRemedioEnum.ANTITERMICO;


public class RotinaDiaria {

    public static void main(String[] args) {

        saudacao();
        MedicamentosRepository med = new MedicamentosRepository();
        med.cadastrarRemedio();



        Aplicacao antiInflamatorios = new AntiInflamatorios("dodoi", "20/05/2022", TipoRemedioEnum.ANTIINFLAMATORIO,
                "dor", 120, "Label");
        antiInflamatorios.aplicacao();
        Aplicacao antitermicos = new Antitermicos("Sem Dodoi", "25 / 5 / 2026", ANTITERMICO,
                "Febre", 30, "Biolab");

        antitermicos.aplicacao();

    }

    private static void saudacao() {

        System.out.println("\nBem Vindo(a) ao estoque da Farmacia Farmapel!\n");
    }

}

