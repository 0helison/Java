package ex03.entities;

public class Flauta extends Instrumento {
    @Override
    public void tocar(){
        System.out.println("Tocando flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando flauta");
    }
}
