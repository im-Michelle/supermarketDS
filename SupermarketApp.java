package DSExcercises;

import java.util.LinkedList;

public class SupermarketApp {
    public static void main(String[] args) {
        LinkedList<Producto> productos = new LinkedList<>();
        generarProductos(productos);

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto "+(i+1)+" "+productos.get(i).getCantidad()+" "+
                    productos.get(i).getPrecio()+" "+productos.get(i).total());
        }



    }
    public static int generarAleatorio(int numero1, int numero2){
        int numeroAleatorio =  (int)(numero1 + Math.random()*numero2);
        return numeroAleatorio;
    }

    public static LinkedList<Producto> generarProductos(LinkedList<Producto> listaLaQueSeaQueContegaProductos){
        for (int i = 1; i < generarAleatorio(1,8); i++) {
            Producto producto = new Producto(generarAleatorio(1,100),generarAleatorio(1,100));
            listaLaQueSeaQueContegaProductos.push(producto);
        }
        return listaLaQueSeaQueContegaProductos;
    }
}