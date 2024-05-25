package test.models;

public class Rafturi extends Elemente{

    private Produse p1;
    private Produse p2;

    public Rafturi(Produse p1, Produse p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Produse getP2() {
        return p2;
    }
    public void setP2(Produse p2) {
        this.p2 = p2;
    }
    public Produse getP1() {
        return p1;
    }
    public void setP1(Produse p1) {
        this.p1 = p1;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int x, int y){
        p1.translatare(x, y);
        p2.translatare(x, y);
    }

    @Override
    public Elemente duplicare(){
        return new Rafturi(p1, p2);
    }

    @Override
    public String toString() {
        String text = "";
        text+= "Raft: " + "\n" + p1.toString() +  p2.toString();
        return text;
    }
}
