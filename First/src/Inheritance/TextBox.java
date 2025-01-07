package Inheritance;

public class TextBox extends UIControl{
    private String text = "";
    public void setText(String text){
        this.text = text;
    }
    public void clearText(){
        text = "";
    }
    @Override
    public String toString(){
        return text;
    }
    public String text(){
        return text;
    }
}
