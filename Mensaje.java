/*
* @author Ian Alexander Ruiz González
* Grupo: 2CV3
* UA:POO
* Profesor: Saul de la O Torres
*/
public class Mensaje {

    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void mostrarMensaje() {
        System.out.println(this.cadena);
    }

    @Override
    public String toString() {
        return "Mensaje{" + "cadena=" + cadena + '}';
    }
}