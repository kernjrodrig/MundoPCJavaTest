package com.gm.mundopc;


import java.util.StringJoiner;

public class Raton extends DispositivoEntrada  {
    private final int idRaton;
    private static int contadorRatones;


    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", Raton.class.getSimpleName() + "[", "]")
                .add("idRaton=" + idRaton)
                .toString();
    }
}
