package ex03.application;

import ex03.entities.*;

public class Programn {
    public static void main(String[] args) {
        Polimorfismo p = new Polimorfismo();
        p.afinar(new Arpa());
        p.afinar(new Violao());
        p.afinar(new Flauta());

        p.tocar(new Arpa());
        p.tocar(new Violao());
        p.tocar(new Flauta());

        p.cordas(new Arpa());
        p.cordas(new Violao());

    }
}
