package client.components.botin;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import services.ObjGraficosService;
import services.RecursosService;

public class BotinTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private BotinComponent botinComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public BotinTemplate(BotinComponent botinComponent){

        this.botinComponent = botinComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/botin/fondoBotin.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GREEN);
    }
}