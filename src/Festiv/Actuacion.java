package Festiv;

public class Actuacion {
	
	
	
	
	//Nombre grupo
	
	private String nombreGrupo;
	//Duracion
	
	private int duracion;


	public Actuacion (){
		
	}

	
	
	//Getters y Setters	
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
	
	public String getInfo(){
		 String info= this.getNombreGrupo()+" : "+ this.getDuracion();
		 return info;
	}
	
	
	
}
