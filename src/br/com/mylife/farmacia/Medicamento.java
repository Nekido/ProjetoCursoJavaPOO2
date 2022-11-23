package br.com.mylife.farmacia;

public class Medicamento {

    private String nome;
    private String validade;
    private TipoRemedioEnum tipo;
    private String indicacao;
    private Integer quantidade;
    private String laboratorio;



    public Medicamento(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade, String laboratorio) {
        this.nome = nome;
        this.validade = validade;
        this.tipo= tipo;
        this.indicacao = indicacao;
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


    public TipoRemedioEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoRemedioEnum tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade(TipoRemedioEnum analgesico) {
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
                ", validade=" + validade +
                ", tipo=" + tipo +
                ", indicacao='" + indicacao + '\'' +
                ", quantidade=" + quantidade +
                ", laboratorio='" + laboratorio + '\'' +
                '}';
    }
}
