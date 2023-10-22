package ex01.entities;

public class Passaro extends Animal implements IAnimalQueVoa{
    public Passaro(String name, String especie, String habitat, int idade, double peso) {
        super(name, especie, habitat, idade, peso);
    }

    @Override
    public void somEmitido() {
        System.out.println("Piu-Piu");
    }

    @Override
    public void voa() {
        System.out.println("Voando");
    }
}
