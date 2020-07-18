/*
Diseñe un algoritmo de tal manera, que le permita almacenar una Colección de
implementos(materiales) del proyecto autónomo, además cree un objeto ArrayList
en el cual deberá insertar objetos de la clase String. Luego elimine elementos 
que no se van a usar y finalmente invoque el método size para que le permita 
devolver el tamaño de la colección de elementos de la clase String
 */
package colecciontarea1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("--------------------------");
        System.out.println("NOMBRE: WILLIAM TACO");
        System.out.println("FECHA: 17-07-2020");
        System.out.println("CARRERA: ING. AUTOMOTRIZ");
        System.out.println("--------------------------");
        
        Collection listaMaterialesProyecto = new ArrayList<String>();
        listaMaterialesProyecto.add("LM 358 IC");
        listaMaterialesProyecto.add("Led infrarrojo emisor");
        listaMaterialesProyecto.add("Led infrarrojo receptor");
        listaMaterialesProyecto.add("Potenciómetro");
        listaMaterialesProyecto.add("Protoboard");
        listaMaterialesProyecto.add("Fuente de alimentación");
        listaMaterialesProyecto.add("Cables conectores");
        listaMaterialesProyecto.add("Resistencias");
        listaMaterialesProyecto.add("Led");
        listaMaterialesProyecto.add("Cautin");
        listaMaterialesProyecto.add("Condensador");
        listaMaterialesProyecto.add("Estaño");
        listaMaterialesProyecto.add("Arduino");
        listaMaterialesProyecto.add("Auto de jueguete");
        listaMaterialesProyecto.add("Circuitos Integrado 555");
        System.out.println("Numero de materiales del proyecto: "+listaMaterialesProyecto.size());
        System.out.println("LOS MATERIALES SON: ");
        System.out.println(listaMaterialesProyecto.toString());
        System.out.println("--------------------------");
        listaMaterialesProyecto.remove("Arduino");
        listaMaterialesProyecto.remove("Estaño");
        listaMaterialesProyecto.remove("Cautin");
        listaMaterialesProyecto.remove("Circuitos Integrado 555");
        System.out.println("LOS MATERIALES QUE SE VAN A USAR EN EL PROYECTO SON: "+listaMaterialesProyecto.size());
        System.out.println(listaMaterialesProyecto.toString());
        System.out.println("--------------------------");
        System.out.println("LOS MATERIALES QUE NO SE VAN A USAR EN EL PROYECTO SON: 4");
        
    }
    
}
