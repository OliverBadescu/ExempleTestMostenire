package test.models;

public class Traseu extends Elemente{

    private Punct p1;
    private Punct p2;

    public Traseu(Punct p1, Punct p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punct getP1(){return this.p1;}
    public void setP1(Punct p1){this.p1 = p1;}
    public Punct getP2(){return this.p2;}
    public void setP2(Punct p2){this.p2 = p2;}

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int x,int y){
        this.p1.translatare(x,y);
        this.p2.translatare(x,y);

    }

    @Override
    public Elemente duplicare(){
        return new Traseu(this.p1, this.p2);
    }

    @Override
    public String toString(){
        String text = "";
        text += "P1: " +"\n" + p1.toString();
        text += "P2: " +"\n" + p2.toString();
        return text;
    }

}
