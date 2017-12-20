package Festiv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Festival {

	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
	 
		// Crear una actuacion por programacion
		
		Actuacion a1= new Actuacion();
		
		a1.setNombreGrupo("ac-dc");
		a1.setDuracion(90);
		
		
		
//		//Crear una actuacion con inputs de teclado
//		
//		Actuacion a2= new Actuacion();
//		
//		System.out.println("Introduce un nombre de grupo");
//		
//		 Scanner lector= new Scanner (System.in);
//		 String nombre =lector.nextLine();
//		 a2.setNombreGrupo(nombre);
//		 
//		System.out.println("Introduce una duracion");
//		 
//		 String duracion =lector.nextLine();
//		 
//		 a2.setDuracion(Integer.parseInt(duracion));
		 
		
		
		
		
		
		//Crear una actuacion leyendo desde fichero
		 
		 File f= new File ("D:/ficherosjava/actuaciones.txt");
		 
		 Scanner lectorF;
		
		 Actuacion a3 =new Actuacion();
		 
		 try {
		
			
			lectorF = new Scanner (f);
			
			while(lectorF.hasNextLine()){
			String[] linea= lectorF.nextLine().split(":");
			
			a3.setNombreGrupo(linea[0]);
			a3.setDuracion(Integer.parseInt(linea[1]));
			
			
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 // Crear un festival y meterle las 3 actuaciones
		 
		 Festival festival =new Festival();
		 festival.setNombre("Jazzaldi");
		 festival.setPatrocinador("Heineken");
		 
		 ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		 
		 actuaciones.add(a1);
		// actuaciones.add(a2);
		 actuaciones.add(a3);
		 
		 festival.setActuaciones(actuaciones);
		 
		 
		 // Utilizando addActuacion
		 Actuacion a4 = new Actuacion();
		 
		 a4.setNombreGrupo("Mikel Laboa");
		 a4.setDuracion(100);
		 
		 festival.addActuacion(a4);
		 
		 festival.addActuacion("Linkin Park", 95);
		 
		 
		 
		 festival.mostrarInfo();
		 
		 
		 
		 festival.addActuacion("Slipknot", 50);
		 
		 festival.mostrarInfo(); //Falla iterador xq actuaciones es null
		 
		 
		 festival.addActuacion("El reno renardo", 100);
		 
		 festival.mostrarInfo();
		 
		 
		 System.out.println("Introduce un grupo para eliminar delf estival");
		 String grupo= lector.nextLine();
		 
		 festival.eliminarActuacion(grupo);
		 
		 //-------------------------------------
		 
		 actuaciones = festival.getActuaciones();
		 
		 festival.mostrarInfo();
		 
			 

	}
	
	
	

}
