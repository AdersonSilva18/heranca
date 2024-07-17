package br.edu.unifil.ipoo.rh.modelo;

public class Funcionario extends Pessoa{
    private Long matricula;
    protected Double salario;

    public Long getMatricula() {
        return matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
