package org.example.Domain.Model;

import java.util.Random;

public class Aluno {
    protected String nome;
    protected int idade;
    protected String matricula;
    protected String curso;

    public Aluno(String nome, int idade, String curso) {
        setNome(nome);
        setIdade(idade);
        setCurso(curso);
        gerarMatricula();
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome do aluno não pode ser vazio ou nulo.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 150) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("A idade do aluno deve ser um número positivo e plausível.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    private void gerarMatricula() {
        int anoAtual = java.time.LocalDate.now().getYear();
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000); // Gera um número aleatório entre 0 e 999
        this.matricula = String.format("%d%03d", anoAtual, numeroAleatorio);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.isEmpty()) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("O curso do aluno não pode ser vazio ou nulo.");
        }
    }


    public void exibirInformacoes() {
        System.out.println("--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
