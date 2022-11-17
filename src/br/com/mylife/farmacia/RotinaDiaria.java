package br.com.mylife.farmacia;

import java.util.ArrayList;


public class RotinaDiaria {

    public static void main(String[] args) {

        AntiInflamatorios antiInflamatorios = new AntiInflamatorios("Bupril",3/5/2026, 120, "Famed", true);
        Antitermicos antitermicos = new Antitermicos("Febril", 26/9/2024, 30, "Label", true);
        Antibioticos antibioticos = new Antibioticos("Cura Tudo", 11/12/2022, 90, "Sem Dodói", true);


        ArrayList<Integer> medicamentosNoEstoque = new ArrayList<>();
        medicamentosNoEstoque.add(antibioticos.getQuantidade());
        medicamentosNoEstoque.add(antitermicos.getQuantidade());
        medicamentosNoEstoque.add(antiInflamatorios.getQuantidade());

        System.out.println(medicamentosNoEstoque);

        for (Integer medicamentos: medicamentosNoEstoque){
            System.out.println("Quantidade de : " + medicamentosNoEstoque);
//FAZER ELE MOSTRAR O NOME E A QUANTIDADE - ta errado
        }

    }

    public static int totalMedicamentos() {
        int soma = 0;

        return soma;
    }

}
