package client.components.coleccion;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import services.ObjGraficosService;
import services.RecursosService;

public class ColeccionTemplate extends JPanel {

    private ColeccionComponent coleccionComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public ColeccionTemplate(ColeccionComponent coleccionComponent){

        this.coleccionComponent = coleccionComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/coleccion/fondoColeccion.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.CYAN);
    }
    
}