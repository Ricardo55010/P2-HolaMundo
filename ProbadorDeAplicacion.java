/*
* @author Ian Alexander Ruiz González
* Grupo: 2CV3
* UA:POO
*/
public class ProbadorDeAplicacion {

    private Mensaje nuevoMensaje;

    public void probarAplicacion(String cadena) {
        
        String miMensaje = cadena;
        this.nuevoMensaje = new Mensaje();

        if (miMensaje.length() <= 0) {
            this.nuevoMensaje.setCadena("\nHola Java");
        } 
        else {
            this.nuevoMensaje.setCadena("\nHola "+cadena);
        }
        nuevoMensaje.mostrarMensaje();
    }

    @Override
    public String toString() {
        return "ProbadorDeAplicacion{" + "nuevoMensaje=" + nuevoMensaje + '}';
    }

}
