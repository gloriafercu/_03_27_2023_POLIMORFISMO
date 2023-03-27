package com.adecco.modelo;
/*
* Un método abstracto es aquel que no tiene ninguna línea de código, no tiene ninguna implementación.
* Sólo tiene definido el nombre (en la clase padre) y nos viene bien para hacer polimorfismo.
* Siempre que tenga un método abstracto en una clase, automáticamente esa clase será abstracta tb.
*
* Una clase abstracta es una clase incompleta y no se pueden crear objetos de una clase incompleta.
* ¡¡ NO PUEDO INSTANCIAR OBJETOS DE UNA CLASE ABSTRACTA !!
*
* */

public abstract class Producto {
    // 1. Atributos
    protected int idProducto;
    protected String nombreProducto;
    protected double precio;

    // 2. Métodos
    public abstract double calcularIVA();
    @Override
    public String toString() {
        return "Producto {" +
                " idProducto = " + idProducto +
                ", nombreProducto = '" + nombreProducto + '\'' +
                ", precio = " + precio + " " +
                '}';
    }
    // 3. Cosntructores

    public Producto() {
    }
    public Producto(int idProducto, String nombreProducto, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    // 4. Setters y Getters

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecio() {
        return precio;
    }
}
