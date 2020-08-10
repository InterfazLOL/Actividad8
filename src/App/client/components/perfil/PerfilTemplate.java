package client.components.perfil;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class PerfilTemplate extends JPanel{
    
    private PerfilComponent perfilComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondoPerfil;

    public PerfilTemplate(PerfilComponent perfilComponent) {
    
        this.perfilComponent = perfilComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        iFondoPerfil = new ImageIcon("resources/img/perfil/fondoPerfil.jpg");
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondoPerfil);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.BLUE);
    }
}