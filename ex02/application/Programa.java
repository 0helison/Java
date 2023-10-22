package ex02.application;

import ex02.entities.Livro;

public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro(9373290, 11, "A culpa é das estrelas", 1000.00);
        System.out.println(livro.toString());
    }
}
