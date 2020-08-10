package client.components.botin;

public class BotinComponent {

    private BotinTemplate botinTemplate;

    public BotinComponent(){

        botinTemplate = new BotinTemplate(this);
    }

    public BotinTemplate gBotinTemplate(){
        return botinTemplate;
    }
    
}