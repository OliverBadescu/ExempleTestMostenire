package test;

public class Minigame extends Elemente{

    private Arma arma;
    private Armura armura;
    private Jucator p1;

    public Minigame(Arma arma, Armura armura, Jucator p1) {
        this.arma = arma;
        this.armura = armura;
        this.p1 = p1;
    }

    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public Armura getArmura() {
        return armura;
    }
    public void setArmura(Armura armura) {
        this.armura = armura;
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
    public void translatare(int x, int y){
        p1.translatare(x, y);
    }

    @Override
    public Elemente duplicare(){
        return new Minigame(arma, armura, p1);
    }

    @Override
    public String toString(){
        String text = "";
        text += "Arma: " +this.arma.toString();
        text+= "Armura: " + this.armura.toString();
        text += "P1: " + this.p1.toString();
        return text;
    }
}


