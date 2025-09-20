package maratonajava.poo.introametodos.exercicios.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private float salarios[] = null;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(float... salarios) {
        this.salarios = salarios;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
