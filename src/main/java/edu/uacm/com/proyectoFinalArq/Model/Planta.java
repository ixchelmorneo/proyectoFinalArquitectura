package edu.uacm.com.proyectoFinalArq.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
	
	private String nombre;
	
	private String nombreCientifico;
	
	private Date fechaCultivo; 
	
	private String origen;
	
	private String descripcion;
	
	private String uso;

	/**
	 * 
	 */
	public Planta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param nombreCientifico
	 * @param fechaCultivo
	 * @param origen
	 * @param descripcion
	 * @param uso
	 */
	public Planta(String nombre, String nombreCientifico, Date fechaCultivo, String origen, String descripcion,
			String uso) {
		super();
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.fechaCultivo = fechaCultivo;
		this.origen = origen;
		this.descripcion = descripcion;
		this.uso = uso;
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
	 * @return the nombreCientifico
	 */
	public String getNombreCientifico() {
		return nombreCientifico;
	}

	/**
	 * @param nombreCientifico the nombreCientifico to set
	 */
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	/**
	 * @return the fechaCultivo
	 */
	public Date getFechaCultivo() {
		return fechaCultivo;
	}

	/**
	 * @param fechaCultivo the fechaCultivo to set
	 */
	public void setFechaCultivo(Date fechaCultivo) {
		this.fechaCultivo = fechaCultivo;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the uso
	 */
	public String getUso() {
		return uso;
	}

	/**
	 * @param uso the uso to set
	 */
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	
	

}
