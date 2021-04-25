package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    //metodo main
    public static void main(String[] args) {

        //primero creamos los objetos de de la computadora

        Monitor monitor = new Monitor("HP",22);
        Teclado teclado = new Teclado("USB","Logitech");
        Raton raton = new Raton("USB","Red Dragon");

        //creao un objeto de tipo computadora
        Computadora computadora1 = new Computadora ("DELL", monitor,teclado,raton);

        Orden orden1 =  new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
