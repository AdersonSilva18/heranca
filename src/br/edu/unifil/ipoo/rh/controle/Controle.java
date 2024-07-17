package br.edu.unifil.ipoo.rh.controle;

import br.edu.unifil.ipoo.rh.modelo.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    private List<Funcionario> listaEmp = new ArrayList<>();

    public void addFuncionario(Funcionario funcionario){
        this.listaEmp.add(funcionario);
    }

    public String getNameFuncionario(Funcionario funcionario){
        return funcionario.getNome();
    }
}
