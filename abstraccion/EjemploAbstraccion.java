package abstraccion;
import java.util.Date;

public class EjemploAbstraccion {

	public static void main(String[] args) {
		Gato gato = new Gato("Mafi");
		Salchicha salchicha = new Salchicha(3.0,"rosa", new Date());
		Pescado pescado = new Pescado(5.3,"rosa", new Date());
		System.out.println("energia de " + gato.getName() + " es: " + gato.getEnergy());
		gato.eat(pescado);
		System.out.println("energia de " + gato.getName() + " es: " + gato.getEnergy());
		gato.eat(salchicha);
		System.out.println("energia de " + gato.getName() + " es: " + gato.getEnergy());
		

	}

}
