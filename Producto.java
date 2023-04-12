package DSExcercises;

import java.text.DecimalFormat;

public class Producto {
    private int cantidad;
    private double precio;

    public Producto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double total(){
        double total = this.precio * this.cantidad;
        return total;
    }
}