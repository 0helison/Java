package ex01.entities;

public class Cachorro extends Animal implements IAnimalQueCorrer {

    public Cachorro(String name, String especie, String habitat, int idade, double peso) {
        super(name, especie, habitat, idade, peso);
    }

    @Override
    public void somEmitido() {
        System.out.println("Au-Au");
    }

    @Override
    public void corre() {
        System.out.println("Correndo");
    }
}
