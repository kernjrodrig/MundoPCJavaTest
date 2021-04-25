package com.gm.mundopc;

import java.util.StringJoiner;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String TipoEntrada, String marca){
        super(TipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Teclado.class.getSimpleName() + "[", "]")
                .add("idTeclado=" + idTeclado)
                .add("contadorTeclado=" + contadorTeclado)
                .toString();
    }
}
