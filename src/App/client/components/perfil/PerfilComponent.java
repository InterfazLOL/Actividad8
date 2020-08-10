package client.components.perfil;

import client.vistaPrincipal.VistaPrincipalComponent;

public class PerfilComponent {
    
    private PerfilTemplate perfilTemplate;

    public PerfilComponent(){
        perfilTemplate = new PerfilTemplate(this);
    }

    public PerfilTemplate gPerfilTemplate(){
        return perfilTemplate;
    }
}