package abstraccion.compania;

public class Tester implements Empleado{
	private String nombre;
	private Double salario;
	private String especialidad;
	
	
	public Tester(String nombre, Double salario, String especialidad) {
		super();
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


	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
}
