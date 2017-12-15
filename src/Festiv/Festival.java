package Festiv;

import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	
	//Nombre
	
	private String nombre;
	//Patrocinador
	
	private String patrocinador;
	//Arraylist <Axtuacion>
	
	ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();

	
	
	
	public void addActuacion (Actuacion a){
		
		this.actuaciones.add(a);
		
	}
	
	
	public void addActuacion (String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.actuaciones.add(a);
	}
	
	
	
	
	public void mostrarInfo(){
		
		System.out.println(getNombre());
		System.out.println("------------");
		System.out.println("Patrocinado por "+getPatrocinador());
		
		
		Iterator <Actuacion> i = this.actuaciones.iterator();
		//Iterator <Actuacion> i = getActuaciones.iterator();
		
		
		while(i.hasNext()){
				String infoActuacion= i.next().getInfo();
				System.out.println(infoActuacion);
		}
				
		
		
	}
	
	
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}

	
	
	
	
	
}
