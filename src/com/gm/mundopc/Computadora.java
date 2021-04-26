package com.gm.mundopc;

import java.util.StringJoiner;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;


    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;

    }
    //relacion entre las clases entre los demas objetos
    public Computadora(String nombre,Monitor monitor, Teclado teclado, Raton raton){
        this();//llamada al constructor privado idComputadora
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton= raton;

    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Computadora.class.getSimpleName() + "[", "]")
                .add("idComputadora=" + idComputadora)
                .add("nombre='" + nombre + "'")
                .add("monitor=" + monitor)
                .add("teclado=" + teclado)
                .add("raton=" + raton)
                .toString();
    }
}
//test comit