package test;

public class Arma extends Elemente{
    private Jucator p1;

    public Arma(Jucator p1) {
        this.p1 = p1;
    }

    public Jucator getP1() {
        return p1;
    }
    public void setP1(Jucator p1) {
        this.p1 = p1;
    }

    @Override
    public void afisare(){

        System.out.println(this);
    }


    @Override
    public void translatare(int x , int y){
        this.p1.translatare(x,y);

    }

    @Override
    public Elemente duplicare(){
        return new Arma(p1);
    }

    @Override
    public String toString(){
        String text = "";
        text += "P1: " + this.p1.toString();
        return text;
    }
}
