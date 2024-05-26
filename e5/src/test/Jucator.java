package test;

public class Jucator extends Elemente{
    private int x;
    private int y;

    public Jucator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void afisare(){

        System.out.println(this);
    }


    @Override
    public void translatare(int x , int y){
        this.x += x;
        this.y += y;

    }

    @Override
    public Elemente duplicare(){
        return new Jucator(x, y);
    }

    @Override
    public String toString(){
        String text = "";
        text += "x: " + this.x + "\n";
        text += "y: " + this.y + "\n";
        return text;
    }
}
