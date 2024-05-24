package test.models;

public class Punct extends Elemente{

    private int x;
    private int y;

    public Punct(int x, int y){
        this.x= x;
        this.y= y;

    }

    public int getX(){return this.x;}
    public void setX(int x){this.x = x;}
    public int getY(){return this.y;}
    public void setY(int y){this.y = y;}

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translatare(int x, int y) {
        this.x+=x;
        this.y+=y;
    }

    @Override
    public Elemente duplicare() {
        return  new Punct(this.x, this.y);
    }


    @Override

    public String toString(){

        String text ="";
        text +="x = "+x+"\n";
        text +="y = "+y+ "\n";
        return text;
    }
}
