package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.Producto1Necesidad;
import com.adecco.modelo.ProductoLujo;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new ProductoLujo();
        p1.setIdProducto(1);
        p1.setPrecio(10);
        p1.setNombreProducto("Teclado de Windows");
        System.out.println("Id del producto -> " + p1.getIdProducto());
        System.out.println("Nombre del producto -> " + p1.getNombreProducto());
        System.out.println("Precio del producto -> " + p1.getPrecio());
        // System.out.println(p1.toString()); como no hemos declarado el método toString() está cogiendolo de la clase OBJECT
        System.out.println(p1.toString()); // Ahora ya tenemos definido el médo toString() y se accede a la clase Producto
        System.out.println(p1); // Una vez definido el toString() si solo ponemos p1 nos accede al método toString()
        System.out.println("Cálculo del IVA: " + p1.calcularIVA());

        // Dar valores al objeto a través del constructor con los argumentos (sustituye a los setters)
        Producto p2 = new ProductoLujo(2,"Ratón", 20);
        System.out.println(p2.toString());
        System.out.println("Cálculo de IVA del producto: " + p2.calcularIVA());

        // El producto de primera necesidad es una clase hija de producto y
        // hereda todos los atributos y métodos de la clase padre.
        // Sobreescritura de calcularIVA() en producto de primera necesidad
        Producto1Necesidad p1n1 = new Producto1Necesidad();
        p1n1.setPrecio(2);
        System.out.println("Cálculo de IVA de producto primera necesidad: " + p1n1.calcularIVA());

        // POLIMORFISMO
        Producto p3 = new Producto1Necesidad(); // lo que se genera en la memoria realmente es un producto de primera necesidad
        // Producto p3 = new Producto1Necesidad(2, "platano", 1); no se heredan los constructores, tendríamos que crear el constructor en esa clase para poder hacerlo
        p3.setPrecio(1);
        System.out.println("Cálculo de IVA de p3: " + p3.calcularIVA()); // sobreescritura de método y herencia
        Producto p4 = new Producto1Necesidad(4, "platano", 1);
        System.out.println("Cálculo de IVA de p4: " + p4.calcularIVA());
        System.out.println(p4.toString());
        System.out.println(p4); // si no pongo el toString() da lo mismo


        ProductoLujo pl1 = new ProductoLujo(5, "Bicicleta", 500);
        // como usamos el constructor no hacemos uso de los setters
        System.out.println("Cálculo del IVA del pl1: " + pl1.calcularIVA());
        System.out.println(pl1);
    }
}