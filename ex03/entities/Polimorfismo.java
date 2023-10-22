package ex03.entities;

public class Polimorfismo {
    public void tocar(Instrumento i){
        i.tocar();
    }
    public void afinar(Instrumento i){
        i.afinar();
    }
    public void cordas(Cordas i){
        i.cordas();
    }

}
