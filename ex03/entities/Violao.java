package ex03.entities;

public class Violao extends Instrumento implements Cordas{

    @Override
    public void tocar() {
        System.out.println("Tocando violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão");
    }

    @Override
    public void cordas() {
        System.out.println("Trocando cordas");
    }

}
