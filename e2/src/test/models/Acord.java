package test.models;

public class Acord extends Elemente{

    private NotaMuzicala n1;
    private NotaMuzicala n2;

    public Acord(NotaMuzicala n1, NotaMuzicala n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public NotaMuzicala getN1() {
        return n1;
    }
    public void setN1(NotaMuzicala n1) {
        this.n1 = n1;
    }
    public NotaMuzicala getN2() {
        return n2;
    }
    public void setN2(NotaMuzicala n2) {
        this.n2 = n2;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificareOctava(int x, int y){
        this.n1.modificareOctava(x, y);
        this.n2.modificareOctava(x, y);
    }

    @Override
    public Elemente duplicare(){
        return new Acord(this.n1, this.n2);
    }

    @Override
    public String toString(){
        String text = "";
        text += "N1: " + this.n1.toString() + "\n";
        text+= "N2: " + this.n2.toString() +"\n";
        return text;
    }
}
