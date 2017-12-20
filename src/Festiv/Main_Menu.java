package Festiv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//Listar añadir modificar eliminar
public class Main_Menu {

	public static void main(String[] args) throws FileNotFoundException {
		
		final int LISTAR = 1;
		final int INSERTAR = 2;
		final int MODIFICAR= 3;
		final int ELIMINAR = 4;
		
		final int SALIR = 0;
		
		
		
		File fichero =new File ("D:/ficherosjava/actuaciones2.txt");
		Scanner lectorF = new Scanner (fichero);
		Scanner lector1= new Scanner (System.in);
		int opcion;
		
		Festival festival1 =new Festival();
		
		do{
			
			
			System.out.println("---Menu---\n");
			System.out.println(LISTAR+ " listar actuaciones");
			System.out.println(INSERTAR+ " añadir actuacion");
			System.out.println(MODIFICAR+ " modificar actuacion");
			System.out.println(ELIMINAR+ " eliminar actuacion");
			System.out.println(SALIR+ " Salir");

			opcion=Integer.parseInt(lector1.nextLine());
			
			festival1.setNombre("Manifest");
			festival1.setPatrocinador("RedBull");
			
			
			switch (opcion) {
			
			
			
			case LISTAR:
				
				festival1.mostrarInfo();
					
			break;
						
			case INSERTAR:
				insertar(lectorF, festival1);
				
			break;
			case MODIFICAR:
				
				modificar(lector1, festival1);
				
		
					
			break;
			
			case ELIMINAR:
				System.out.println("Introduce el nombre dle grupo que deseas eliminar");
				String grupo= lector1.nextLine();
				eliminarActuacion(grupo,festival1);
				
			break;
				
						
			}
			
		}while(opcion!=SALIR);

	
	}

	private static void eliminarActuacion(String grupo, Festival festival1) {
		
	
		
		Iterator <Actuacion> i =festival1.getActuaciones().iterator();
		
		while (i.hasNext()){
			
			
			
			if(i.next().getNombreGrupo().equals(grupo)){
				i.remove();
						
			}
						
		}
	
	}
		
	

	private static void modificar(Scanner lector1, Festival festival1) {
		
		System.out.println("Introduce el nombre del grupo para cambiarle la duracion");
		
		String nombre_grupo= lector1.nextLine();
		
		System.out.println("Introduce la nueva duracion");
		
		int duracion = (Integer.parseInt(lector1.nextLine()));
		
		festival1.cambiarDuracionActuacion(nombre_grupo, duracion);
		
	}

	private static void insertar(Scanner lectorF, Festival festival1) {
		
		while(lectorF.hasNextLine()){
			
		String[] linea= lectorF.nextLine().split(":");
		
		Actuacion a1= new Actuacion();
		a1.setNombreGrupo(linea[0]);
		a1.setDuracion(Integer.parseInt(linea[1]));
		
		
		festival1.addActuacion(a1);
		}
		
	}
	
	

}
