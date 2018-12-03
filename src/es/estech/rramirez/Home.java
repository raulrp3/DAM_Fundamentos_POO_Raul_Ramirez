package es.estech.rramirez;

public class Home {
    private String address; //Almacena la dirección
    private String cp; //Almacena el código postal
    private int numRooms; //Almacena el número de habitaciones
    private int meters; //Almacena los metros cuadrados.

    //Contructor para crear un nuevo objeto home.
    public Home(String address, String cp, int numRooms, int meters) {
        this.address = address;
        this.cp = cp;
        this.numRooms = numRooms;
        this.meters = meters;
    }

    //Getters y setters.
    public String getAddress() {
        return "Dirección: " + address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCp() {
        return "Código postal: " + cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getNumRooms() {
        return "Número de habitaciones: " + numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getMeters() {
        return "Metros cuadrados: " + meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }

    //Método toString para mostrar toda la información del objeto.
    @Override
    public String toString() {
        return "Dirección: " + this.address +
                "\nCódigo postal: " + this.cp +
                "\nNúmero de habitaciones: " + this.numRooms +
                "\nMetros cuadrados: " + this.meters + "\n";
    }
}
