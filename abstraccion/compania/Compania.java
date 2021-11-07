package abstraccion.compania;

import java.util.ArrayList;

public class Compania {
	private String nombre;
	private String giro;
	private ArrayList<Empleado> empleados;
	
	public Compania(String nombre, String giro) {
		super();
		this.nombre = nombre;
		this.giro = giro;
		this.empleados = new ArrayList<Empleado>();
	}

	public void contratar(Empleado empleado) {
		if(empleado != null) {
			this.empleados.add(empleado);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void crearEquipoProyecto() {
		if(this.empleados != null && !this.empleados.isEmpty()) {
			System.out.println("El equipo de trabajo es: ");
			for(Empleado emp: this.empleados) {
				System.out.println("Nombre: " + emp.getNombre() + " Salario: " + emp.getSalario());
			}
		} else {
			System.out.println("No se cuenta con empleados");
		}
		
	}
	
	
	
}
