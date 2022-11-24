package br.com.mylife.farmacia;


import br.com.mylife.repositoryestoque.MedicamentosRepository;
import br.com.mylife.repositoryestoque.Relatorio;

import java.util.ArrayList;
import java.util.List;


public class RotinaDiaria {

    public static void main(String[] args) {


//     Relatorio<MedicamentosRepository> relatorio = new Relatorio<>();
//     relatorio.criaRelatorioTotal(Antibioticos);



            MedicamentosRepository med = new MedicamentosRepository();
            med.cadastrarRemedio();

        }
    }

