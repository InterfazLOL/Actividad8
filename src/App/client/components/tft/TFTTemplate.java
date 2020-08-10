package client.components.tft;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class TFTTemplate extends JPanel {
    
    private TFTComponent tftComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public TFTTemplate(TFTComponent tftComponent){
        this.tftComponent = tftComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjetosDecoradores();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondo);
        this.add(lFondo);
        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(null);
    }

    public void crearObjetosDecoradores(){
        iFondo = new ImageIcon("resources/img/tft/fondoTFT.jpg");
    }
}