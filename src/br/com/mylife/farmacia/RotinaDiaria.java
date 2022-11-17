package br.com.mylife.farmacia;

import java.util.ArrayList;


public class RotinaDiaria {

    public static void main(String[] args) {

        AntiInflamatorios antiInflamatorios = new AntiInflamatorios("Bupril", "2025", 120, "Famed", true);
        Antitermicos antitermicos = new Antitermicos("Febril", "2023", 30, "Label", true);
        Antibioticos antibioticos = new Antibioticos("Cura Tudo", "2022", 90, "Sem Dodói", true);


        ArrayList<Integer> medicamentosNoEstoque = new ArrayList<>();
        medicamentosNoEstoque.add(antibioticos.getQuantidade());
        medicamentosNoEstoque.add(antitermicos.getQuantidade());
        medicamentosNoEstoque.add(antiInflamatorios.getQuantidade());

        System.out.println(medicamentosNoEstoque);

        for (Integer medicamentos: medicamentosNoEstoque){
            System.out.println("Quantidade de : " + medicamentosNoEstoque);

        }
              {

        }

    }

    public static int totalMedicamentos() {
        int soma = 0;

        return soma;
    }

}
