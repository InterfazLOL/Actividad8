package client.components.inicio.tarjetaVistaGeneral;

import javax.swing.ImageIcon;

public class TarjetaVistaGeneralComponent {
    
    private TarjetaVistaGeneralTemplate tarjetaVistaGeneralTemplate;

    public TarjetaVistaGeneralComponent(String imagen, String texto, int x, int y) {

        tarjetaVistaGeneralTemplate = new TarjetaVistaGeneralTemplate(imagen, texto, x, y);
    }

    public TarjetaVistaGeneralTemplate gTarjetaVistaGeneralTemplate() {

        return tarjetaVistaGeneralTemplate;
    }
}