package client.components.tienda;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import services.ObjGraficosService;
import services.RecursosService;

public class TiendaTemplate extends JPanel {
    
    private TiendaComponent tiendaComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public TiendaTemplate(TiendaComponent tiendaComponent){

        this.tiendaComponent = tiendaComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/tienda/fondoTienda.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
    }
}