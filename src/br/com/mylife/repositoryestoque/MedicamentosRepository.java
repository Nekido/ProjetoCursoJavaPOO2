package br.com.mylife.repositoryestoque;

import br.com.mylife.farmacia.Antibioticos;
import br.com.mylife.farmacia.Medicamento;



import java.util.ArrayList;
import java.util.List;

import static br.com.mylife.farmacia.TipoRemedioEnum.*;

public class MedicamentosRepository {




  public void cadastrarRemedio() {

      List<Medicamento> medRepository = new ArrayList<>();
      medRepository.add(new Medicamento("Sem Dodoi", "25 / 5 / 2026", ANTITERMICO,
              "Febre", 30, "Biolab"));
      medRepository.add(new Medicamento("Analgin", "20 / 2 / 2030", ANTIINFLAMATORIO,
              "Dor", 150, "Doranol"));
      medRepository.add(new Medicamento("Antibin", "3 / 9 / 2023", ANTIBIOTICO,
              "Virose", 20, "Zetex"));
      medRepository.add(new Medicamento("Sedilax", "30 / 8 / 2029", ANTIINFLAMATORIO, "Dor", 120, "Iflab"));
      System.out.println(medRepository);


      Integer soma = 0;
      for (Medicamento medicamentos : medRepository) {
          soma += medicamentos.getQuantidade();

        } System.out.println("Total de medicamentos em estoque:" + soma);


  }
}
