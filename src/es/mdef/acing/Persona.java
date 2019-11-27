package es.mdef.acing;
import java.util.*;


public abstract class Persona {

	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private Date fechaNacimiento;

	public Persona() {
		super();
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}