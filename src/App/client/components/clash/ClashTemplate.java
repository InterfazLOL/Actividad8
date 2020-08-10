package client.components.clash;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class ClashTemplate extends JPanel {
    
    private ClashComponent clashComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondoClash;

    public ClashTemplate(ClashComponent clashComponent){
        
        this.clashComponent = clashComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        iFondoClash = new ImageIcon("resources/img/clash/fondoClash.jpg");
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondoClash);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }
}