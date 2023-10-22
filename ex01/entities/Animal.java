package ex01.entities;

public abstract class Animal {
    protected String name, especie, habitat;
    protected int idade;
    protected double peso;

    public Animal(String name, String especie, String habitat, int idade, double peso) {
        this.name = name;
        this.especie = especie;
        this.habitat = habitat;
        this.idade = idade;
        this.peso = peso;
    }
    public abstract void somEmitido ();
}
