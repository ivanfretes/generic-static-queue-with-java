/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticqueues;

import java.io.IOException;
import java.util.Scanner;
import excepciones.ColaLlena;
import excepciones.ColaVacia;


/**
 *
 * @author ivan
 */ 
 

public class StaticQueuesApp {

    
    private ColaEstatica <Mascota> cola;
    
    public StaticQueuesApp() throws ColaLlena, ColaVacia {
        generarCola();
        
        int op = 0; //String op= "X"; ejemplo si voy a utilizar xtring debo de convertir a numerico
        do {
            System.out.println("\n\nColas con Array\n");
            System.out.println("1.- Insertar");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Consultar");
            System.out.println("0.- Salir");
            op = getInt();
            switch(op) {
            case 1 : //insertar y pasa como parametro un dato
                cargar(); 
                break;
            case 2 : 
                   cola.eliminar(); 
                   break;// elimina un dato
            case 3 : //Consulta el elemento en la cola
                System.out.println("A ser atendida "+cola.consultar()); 
                break;
            }
        }
        
        while(op != 0);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ColaLlena, ColaVacia {
       new StaticQueuesApp();
    }
    

    public void cargar() throws ColaLlena {
        
        try {
            Mascota m;
            String nombre, tipo;
            int edad;

            System.out.println("\n\n<<< Agregue una Mascota a la cola >>>");
            System.out.println("Ingrese el nombre de la mascota");
            nombre = getString();
            System.out.println("Ingrese la edad de la mascota");
            edad = getInt();
            System.out.println("Ingrese el tipo de Mascota");
            tipo = getString();

            m = new Mascota(nombre,edad,tipo);
            cola.agregar(m);
        } catch (ColaLlena e) {
            System.out.println("Error: " + 
                    e.getMessage());
        }
        
    }

    
    public String getString(){
        String s;
        Scanner entrada = new Scanner(System.in);
        s = entrada.next();
        return s;
    } 

    public int getInt(){
        int i;
        Scanner entrada = new Scanner(System.in);
        i = entrada.nextInt();
        return i;
    }

    
    public void generarCola(){
       
        System.out.println("Desea Establecer un limite a la COLA, "
                + "Responda con: 1 = SI o 0 = NO");
        if (getInt() != 0){
            System.out.println("Ingrese el tope de la COLA");
            cola = new ColaEstatica(getInt());
        }
        else {
            cola = new ColaEstatica();  // Utiliza la longitud por defecto
        }
        System.out.println("Tope por defecto: "+ cola.size());
    }

}

