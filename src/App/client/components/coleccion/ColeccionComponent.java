package client.components.coleccion;

public class ColeccionComponent {
    
    private ColeccionTemplate coleccionTemplate;

    public ColeccionComponent(){
        coleccionTemplate = new ColeccionTemplate(this);
    }

    public ColeccionTemplate gColeccionTemplate(){
        return coleccionTemplate;
    }
}