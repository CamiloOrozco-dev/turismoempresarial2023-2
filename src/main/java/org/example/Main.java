package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
       Integer edad = 19;
       // LOS OBJETOS SON VARIABLES, ESPECIALES

        Universidad objetoUniversidad = new Universidad ("Camilo");

        Usuario objetoUsuario = new Usuario(21,"Camilo","123",4,"camilorozco@gmail.com");

        //creo un objeto para acceder o modificar los atributos o metodos de ese objeto o elemento

        System.out.println(objetoUniversidad.nombres);
        System.out.println(objetoUsuario);
    }
}