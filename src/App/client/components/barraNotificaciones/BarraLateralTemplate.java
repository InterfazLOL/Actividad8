package client.components.barraNotificaciones;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class BarraLateralTemplate extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private BarraLateralComponent barraLateralComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JPanel pHerramientasVentana;
    private JButton bAyuda, bMinimizar, bConfiguracion, bCerrar;

    private ImageIcon iAyuda, iMinimizar, iConfiguracion, iCerrar;

    public BarraLateralTemplate(BarraLateralComponent barraLateralComponent){
        this.barraLateralComponent = barraLateralComponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();

        crearObjetosDecoradores();
        crearJPaneles();
        crearJButtons();

        this.setSize(223, 720);
        this.setBackground(new Color(1, 10, 19));
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearObjetosDecoradores(){

        iAyuda = new ImageIcon("resources/img/barraLateral/ayuda.png");
        iMinimizar = new ImageIcon("resources/img/barraLateral/minimizar.png");
        iConfiguracion = new ImageIcon("resources/img/barraLateral/configuracion.png");
        iCerrar = new ImageIcon("resources/img/barraLateral/cerrar.png");
    }

    private void crearJPaneles(){
        pHerramientasVentana = sObjGraficos.construirJPanel(0, 0, 223, 80, null, null, null);
        pHerramientasVentana.setBackground(Color.BLACK);
        this.add(pHerramientasVentana);
    }
    
    private void crearJButtons(){

        bAyuda = sObjGraficos.crearJButton("", 98, 8, 12, 12, sRecursos.getcMano(), iAyuda, null, null, null, null, "c", false, false);
        pHerramientasVentana.add(bAyuda);
        bMinimizar = sObjGraficos.crearJButton("", 131, 8, 12, 12, sRecursos.getcMano(), iMinimizar, null, null, null, null, "c", false,
            false);
        bMinimizar.addActionListener(barraLateralComponent);
        pHerramientasVentana.add(bMinimizar);
        bConfiguracion = sObjGraficos.crearJButton("", 165, 8, 12, 12, sRecursos.getcMano(), iConfiguracion, null, null, null, null,
            "c", false, false);
        pHerramientasVentana.add(bConfiguracion);
        bCerrar = sObjGraficos.crearJButton("", 199, 10, 10, 10, sRecursos.getcMano(), iCerrar, null, null, null, null, "c", false, false);
        bCerrar.addActionListener(barraLateralComponent);
        pHerramientasVentana.add(bCerrar);
    }

    public JButton getbAyuda() {
        return bAyuda;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }

    public JButton getbConfiguracion() {
        return bConfiguracion;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }
}
