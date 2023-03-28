package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.Producto1Necesidad;
import com.adecco.modelo.ProductoLujo;

public class ProbarProducto {
    public static void main(String[] args) {
        /* Queremos definir ARRAY DE PRODUCTOS */

        // OJO !!! : Ese NEW es para crear las CELDAS DEL ARRAY,
        // no puedo instanciar Producto como objeto pq es una clase abstracta
        Producto[] productos = new Producto[4];
        Producto1Necesidad p1 = new Producto1Necesidad(1, "Arroz", 2);
        Producto1Necesidad p2 = new Producto1Necesidad(2, "Quinoa", 4);
        ProductoLujo p3 = new ProductoLujo(3, "Ratón", 12);
        ProductoLujo p4 = new ProductoLujo(4, "Teclado", 20);
        // Asignar los productos a las celdas del array
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;

        // Ahora queremos recorrer el array: lo haremos a través de un bucle FOR
        // Me calculará el IVA en función de si es un producto de lujo o de primera necesidad pq los métodos son diferentes en las clases
        System.out.println("------------FOR-----------");

        for(int i = 0; i < productos.length; i++) {
            System.out.println("El IVA del producto " + (i + 1) +  " es " + productos[i].calcularIVA());
        }

        System.out.println("------------FOREACH-----------");
        // Necesitamos una variable de referencia o apuntador a un objeto (no una i) que es Producto,
        // luego se ponen : y después una colección (array)

        for (Producto elemento : productos) {
            System.out.println("El IVA del producto " + elemento.getIdProducto() + " es " + elemento.calcularIVA());
        }

        

    }
}
