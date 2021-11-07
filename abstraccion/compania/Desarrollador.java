package abstraccion.compania;

public class Desarrollador implements Empleado{
	private String nombre;
	private double salario;
	private String especialidad;
	
	public Desarrollador(String nombre, double salario, String especialidad) {
		
		this.nombre = nombre;
		this.salario = salario;
		this.especialidad = especialidad;
	}

	@Override
	public Double getSalario() {
		
		return salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	

}
