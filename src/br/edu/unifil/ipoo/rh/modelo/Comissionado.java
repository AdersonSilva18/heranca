package br.edu.unifil.ipoo.rh.modelo;

public class Comissionado extends Funcionario{
    private Double comisao;
    private Double quantidadeVendida;

    public Double getComisao() {
        return comisao;
    }

    public void setComisao(Double comisao) {
        this.comisao = comisao;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Double quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
