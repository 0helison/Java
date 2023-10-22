package ex03.entities;

public class Arpa extends Instrumento implements Cordas{
    @Override
    public void tocar(){
        System.out.println("Tocando arpa");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando arpa");
    }

    @Override
    public void cordas() {
        System.out.println("Trocando cordas");
    }
}
