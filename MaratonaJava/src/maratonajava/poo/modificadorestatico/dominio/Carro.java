package maratonajava.poo.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLim = 250;

    public void imprime(){
        System.out.println("------------------------------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade máxima: " + this.velocidadeMax);
        System.out.println("velocidade limite: " + velocidadeLim);
    }

    public Carro(String nome, double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setVelocidadeLim(double velocidadeLim){
        Carro.velocidadeLim = velocidadeLim;
    }

    public static double getVelocidadeLim(){
        return Carro.velocidadeLim;
    }

}

