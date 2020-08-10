package client.components.tienda;

public class TiendaComponent {
    
    private TiendaTemplate tiendaTemplate;

    public TiendaComponent(){
        tiendaTemplate = new TiendaTemplate(this);
    }

    public TiendaTemplate gTiendaTemplate(){
        return tiendaTemplate;
    }
}