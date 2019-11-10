package edu.uacm.com.proyectoFinalArq.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
	
	private String nombre;
	
	private String correo ;
	
	private int edad;
	
	private String Genero;
	
	private String telefono;
	
	private String tipo;

	
	
	/**
	 * 
	 */
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param nombre
	 * @param cirreo
	 * @param edad
	 * @param genero
	 * @param telefono
	 * @param tipo
	 */
	public Usuario(String nombre, String correo, int edad, String genero, String telefono, String tipo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
		Genero = genero;
		this.telefono = telefono;
		this.tipo = tipo;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}



	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * @return the genero
	 */
	public String getGenero() {
		return Genero;
	}



	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		Genero = genero;
	}



	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
	


}
