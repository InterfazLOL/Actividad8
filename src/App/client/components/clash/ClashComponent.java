package client.components.clash;

public class ClashComponent {
    
    private ClashTemplate clashTemplate;

    public ClashComponent(){

        clashTemplate = new ClashTemplate(this);
    }

    public ClashTemplate gClashTemplate(){
        return clashTemplate;
    }
}