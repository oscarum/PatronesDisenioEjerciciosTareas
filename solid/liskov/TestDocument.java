package solid.liskov;

public class TestDocument
{
    public static void main(String[] args) {
        Project project = new Project();
        Document actaProyecto = new WritableDocument("actaProyecto");
        
        Document especificacionRequerimientos = new WritableDocument("especificacionRequerimientos");
        Document especificacionArquitectonica = new WritableDocument("especificacionArquitectonica");
        actaProyecto.setData("Datos1");
        especificacionRequerimientos.setData("Datos2");
        especificacionArquitectonica.setData("Datos3");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}
