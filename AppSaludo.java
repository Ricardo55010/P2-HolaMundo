/*
* @author Ian Alexander Ruiz González
* Grupo: 2CV3
* UA:POO
* Profesor: Saul de la O Torres
*/
public class AppSaludo {

    public static void main(String[] args) {
        String cadena = "";
        
        for (String arg : args) {
            cadena+=(arg+" ");
        }
        ProbadorDeAplicacion miAplicacion = new ProbadorDeAplicacion();
        miAplicacion.probarAplicacion(cadena);
    }
}

