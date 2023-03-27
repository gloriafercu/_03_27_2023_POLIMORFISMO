package com.adecco.modelo;

public class ProductoLujo extends Producto {
    @Override
    public double calcularIVA() {
        return precio * 0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo {" +
                " idProducto = " + idProducto +
                ", nombreProducto = '" + nombreProducto + '\'' +
                ", precio = " + precio + " " +
                '}';
    }

    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String nombreProducto, double precio) {
        super(idProducto, nombreProducto, precio);
    }
}
