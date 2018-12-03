package es.estech.rramirez;

import java.util.ArrayList;

public class ListHome {
    private ArrayList<Home> list; //Almacena un listado de objetos de tipo Home

    //Consutructor para crear un nuevo objeto de tipo ListHome.
    public ListHome(ArrayList<Home> list) {
        this.list = list;
    }

    //Método que muestra el listado de las direcciones.
    public void listAddress() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ".- " + this.list.get(i).getAddress());
        }
    }

    //Método que muestra el listado de los códigos postales.
    public void listCp() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ".- " + this.list.get(i).getCp());
        }
    }

    //Método que muestra el listado del número de habitaciones.
    public void listNumRooms() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ".- " + this.list.get(i).getNumRooms());
        }
    }

    //Método que muestra el listado de los metros cuadrados.
    public void listMeters() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ".- " + this.list.get(i).getMeters());
        }
    }
}
