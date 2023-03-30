/**
    Recorre nombres dentro de un objeto y los muestra en pantalla
*/

import java.util.*;

public class Main {
    
	//Ojo en el objeto, si se ponen nuevos al cerrar las llaves no olvidarse de la coma
    static Object[][] query = {
        {"Cristiano Ronaldo","Football Player",37},
        {"Carlos Ramirez","Citrix Administrator",27},
        {"Carlos Ramirez","Web Designer",26},
        {"Pepe","UI/UX Designer",27},
        {"David Broncano","Humorist",33},
        {"Emily","Becaria Pro",22},
        {"Benito Camela","Student",15},
        {"Albert Einstein","Cientifico",76},
		{"Miguel","Coordi",45}
    };
    
    static String buscaResultado(Object[] data) {
        var queryResultado = "";
        var usuarios = 0;
        if(data.length==0) {
            for(var x=0;x<query.length;x++) {
                for(var y=0;y<query[x].length;y++) {
             System.out.print(query[x][y]+", ");
                    
                }
                System.out.println("");
            }
        }
		//Estructura del usuario
        list: for(var i=0;i<query.length;i++) {
             for(var q=0;q<query[i].length;q++) {
                 for(var d=0;d<data.length;d++){
                     if(query[i][q].toString().toLowerCase().contains(data[d].toString().toLowerCase())) {
                         usuarios++;
                         queryResultado += "\n Nombre: "+query[i][0] +"\n Profesion: "+query[i][1] + "\n Edad: "+query[i][2]+"\n";
                         continue list;
                     }
                 }
             }
        }
		//Pintar resu
        System.out.println("usuarios en la BD: "+usuarios);
        return queryResultado;
    }
    
    public static void main(String[] args) {
    try {
		//Encuentra un usuario y salta al siguiente
        System.out.println(buscaResultado(new Scanner(System.in).nextLine().split(" ")));
        } catch(NoSuchElementException e) {
        //Si no encontramos nada, lo dejamos vacio
            System.out.println(buscaResultado(new Object[]{""}));
        }
    }
}