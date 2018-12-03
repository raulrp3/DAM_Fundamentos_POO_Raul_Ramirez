package es.estech.rramirez;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Se crean 3 objetos de tipo Home.
        Home h1 = new Home("Paseo de los Marqueses nº 9", "23700", 7, 70);
        Home h2 = new Home("Alfonso X el Sabio nº 13", "23700", 5, 90);
        Home h3 = new Home("Senda la Moza nº 30", "23700", 10, 120);
        //Se declara un arrayList de tipo Home y se añaden los objetos h1,h2,h3.
        ArrayList<Home> listHome = new ArrayList<>();
        listHome.add(h1);
        listHome.add(h2);
        listHome.add(h3);
        //Se crea un objeto de tipo ListHome y se le pasa el arrayList.
        ListHome list = new ListHome(listHome);
        //Se muestra los distintos listados.
        System.out.println("-- LISTADO DE DIRECCIONES --");
        list.listAddress();
        System.out.println();
        System.out.println("-- LISTADO DE CÓDIGOS POSTALES --");
        list.listCp();
        System.out.println();
        System.out.println("-- LISTADO DE NÚMERO DE HABITACIONES --");
        list.listNumRooms();
        System.out.println();
        System.out.println("-- LISTADO DE METROS CUADRADOS --");
        list.listMeters();
    }
}
