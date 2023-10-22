package ex01.entities;

public class Gato extends Animal implements IAnimalQueCorrer{
    public Gato(String name, String especie, String habitat, int idade, double peso) {
        super(name, especie, habitat, idade, peso);
    }

    @Override
    public void somEmitido() {
        System.out.println("Miau");
    }

    @Override
    public void corre() {
        System.out.println("Correndo");
    }
}
