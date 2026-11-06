public class Examen {
    public static void main(String[] args) {
        double precio1 = 12.5;
        double unidad1 = 4;
        double final1 = procesarPrecioFinal(precio1, unidad1);
        System.out.println("Pedido 1: " + final1 + " euros");
        double precio2 = 8.0;
        double unidad2 = 5;
        double final2 = procesarPrecioFinal(precio2, unidad2);
        System.out.println("Pedido 2: " + final2 + " euros");
        double plazo = (final1 + final2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (unidad1 + unidad2) / 2;
        System.out.println("Media de unidades por pedido: " + m);
    }

    private static double procesarPrecioFinal(double precio1, double unidad1) {
        double total1 = precio1 * unidad1;
        double descuento1 = total1 * 10 / 100;
        double final1 = total1 - descuento1;
        return final1;
    }
}


// primero le cambio los nombres a las variables para entenderlo mejor con control + f6
//despues le hago un breakpoint y le doy a debug y con ctrol + f8 puedo ver el valor de las variables para ver que falla del codigo
//en el total2 se estaba sumando el precio + la unidad y tenía que multiplicarse
//las unidades estaban en numeros enteros y para poner la media necesitaba decimales asi que en las unidades he quitado el int y he puesto el double
//para arreglar lo del plazo, lo que he hecho es poner parénteis para que primero se hagan las sumas de los precios finales y luego ya dividirlo entre 3, ya que antes solo se estaba dividiendo entre 3 la variable final2
//Las operaciones que se repiten las extraigo a métodos propios con cntrol+alt+M para que se vea más limpio el código
//Le doy a ctrol + alt + l para que el codigo se pueda leer bien