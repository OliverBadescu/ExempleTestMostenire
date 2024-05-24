package test.models;

public class Destinatie extends Elemente{

    private Traseu traseu;
    private Punct p1;

    public Destinatie(Punct p1, Traseu traseu) {
        this.p1 = p1;
        this.traseu = traseu;
    }

    public Traseu getTraseu() {
        return traseu;
    }
    public void setTraseu(Traseu traseu) {
        this.traseu = traseu;
    }
    public Punct getP1() {
        return p1;
    }
    public void setP1(Punct p1) {
        this.p1 = p1;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int x,int y){
        this.p1.translatare(x,y);

    }

    @Override
    public Elemente duplicare(){
        return new Destinatie(this.p1,this.traseu);
    }

    @Override
    public String toString(){
        String text = "";
        text+= "Traseu: " + traseu.toString() +"\n";
        text += "P1: " +"\n" + p1.toString();
        return text;
    }
}
