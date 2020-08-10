package client.components.barraNotificaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import client.vistaPrincipal.VistaPrincipalComponent;

public class BarraLateralComponent implements ActionListener {

    private BarraLateralTemplate barraLateralTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public BarraLateralComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        barraLateralTemplate = new BarraLateralTemplate(this);
    }

    public BarraLateralTemplate getBarraLateralTemplate() {
        return barraLateralTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == barraLateralTemplate.getbCerrar())
            System.exit(0);
        else if (e.getSource() == barraLateralTemplate.getbMinimizar())
            vistaPrincipalComponent.minimizar();
    }

}