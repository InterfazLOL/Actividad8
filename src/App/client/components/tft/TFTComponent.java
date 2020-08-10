package client.components.tft;

public class TFTComponent {
    
    private TFTTemplate tftTemplate;

    public TFTComponent(){
        tftTemplate = new TFTTemplate(this);
    }

    public TFTTemplate gTftTemplate(){
        return tftTemplate;
    }
}