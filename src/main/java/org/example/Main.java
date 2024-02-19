package org.example;

import org.example.Domain.Model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 20,"Engenharia de Computação");
        Aluno aluno2 = new Aluno("Maria Santos", 22, "Administração");
        Aluno aluno3 = new Aluno("Pedro Oliveira", 21, "Enfermagem");

        aluno1.exibirInformacoes();

        aluno1.setCurso("Engenharia Mecanica");

        aluno1.exibirInformacoes();

        aluno2.exibirInformacoes();

        aluno2.setCurso("Medicina");

        aluno2.exibirInformacoes();

        aluno3.exibirInformacoes();

        aluno3.setCurso("Administração");

        aluno3.exibirInformacoes();
    }
}