package Festiv;

import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	
	//Nombre
	
	private String nombre;
	//Patrocinador
	
	private String patrocinador;
	//Arraylist <Actuacion>
	
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
		System.out.println(this.getDuracion()+" minutos de musica!!");
		
		
		Iterator <Actuacion> i = this.actuaciones.iterator();
		
		//Iterator <Actuacion> i = getActuaciones.iterator();
		
		
		while(i.hasNext()){
				String infoActuacion= i.next().getInfo();
				System.out.println(infoActuacion);
		}
				
		
	}
	
	
	
	
	private int getDuracion (){
		
		Iterator <Actuacion> i = this.actuaciones.iterator();
		int suma=0;
		
		while (i.hasNext()){
			
			suma=suma+ i.next().getDuracion();
			
		}
		
		return suma;
	}
	
	
	
	
	public void eliminarActuacion (String grupo){
		
		Iterator <Actuacion> i =this.actuaciones.iterator();
		
		while (i.hasNext()){
			
			
			
			if(i.next().getNombreGrupo().equals(grupo)){
				i.remove();
						
			}
						
		}
	
	}
	
	
	public void cambiarDuracionActuacion (String nombre_grupo, int duracion){
		
		
		for (int i=0; i< this.actuaciones.size(); i++){
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombre_grupo)){
				
				//Actuacion a = new Actuacion (nombre_grupo, duracion);
				
				Actuacion a = this.actuaciones.get(i);
				a.setDuracion(duracion);
				this.actuaciones.set(i, a);
				
			}
			
			
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
