package solid.liskov;

/*
El tipo de cada parametro en el metodo de la subclase debe ser igual o mas abstracto que en la superclase
 */
class Padre {
    public void metodoPadre(Circulo circulo) {
    }
}

class Hijo extends Padre {
    public void metodoHijo() {
    }

    public void metodoPadre(Figura circulo) {
    }
}

class Figura {
}

class Circulo extends Figura {
}

class CirculoEspecial extends Circulo {

}

public class TestLiskov
{
    public static void main(String[] args) {
        Hijo hijo = new Hijo();
        hijo.metodoPadre(new CirculoEspecial());
    }
}
