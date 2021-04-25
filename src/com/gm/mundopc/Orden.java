package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[]; //objeto de tipo computadora
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;// incrementamos la variable contadorComputadora(pos incremento)
        }else {
            System.out.println("Has superado el maximo de computadoras"+ Orden.MAX_COMPUTADORAS);
        }

    }
        public void mostrarOrden(){
            System.out.println("orden: " + this.idOrden);
            System.out.println("computadoas de la orden: "+this.idOrden);
            for (int i = 0; i < this.contadorComputadoras; i++) {
                System.out.println(this.computadoras[i]);

            }
        
        }



}
