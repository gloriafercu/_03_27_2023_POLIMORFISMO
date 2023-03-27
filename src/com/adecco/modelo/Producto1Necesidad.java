package com.adecco.modelo;

public class Producto1Necesidad extends Producto {
    @Override
    public double calcularIVA() {
        // Vamos a sobreescribir el método de su padre
        return precio * 0.04;
    }

    @Override
    public String toString() {
        return "Producto1Necesidad {" +
                " idProducto = " + idProducto +
                ", nombreProducto = '" + nombreProducto + '\'' +
                ", precio = " + precio + " " +
                '}';
    }

    public Producto1Necesidad() {
    }

    public Producto1Necesidad(int idProducto, String nombreProducto, double precio) {
        super(idProducto, nombreProducto, precio);
    }
}
