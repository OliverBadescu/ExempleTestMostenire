package test.models;

public class Raion extends Elemente{

    private Rafturi r1;
    private Rafturi r2;

    public Raion(Rafturi r1, Rafturi r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Rafturi getR1() {
        return r1;
    }
    public void setR1(Rafturi r1) {
        this.r1 = r1;
    }
    public Rafturi getR2() {
        return r2;
    }
    public void setR2(Rafturi r2) {
        this.r2 = r2;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int x, int y){
        r1.translatare(x, y);
        r2.translatare(x, y);
    }

    @Override
    public Elemente duplicare(){
        return new Raion(r1, r2);
    }

    @Override
    public String toString() {
        String text = "";
        text += "Raion: " +"\n" + r1.toString() + r2.toString();
        return text;
    }
}
