package pojos;

public class mes{
    int numero;
    String nombre;
    int cantidadDias;

    public mes(int numero, String nombre, int cantidadDias) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
