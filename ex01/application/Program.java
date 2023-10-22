package ex01.application;

import ex01.entities.Passaro;

public class Program {
    public static void main(String[] args) {
        Passaro passaro = new Passaro("Cimário", "Ave", "Selva", 1, 0.9 );
        passaro.somEmitido();
        passaro.voa();
    }
}
