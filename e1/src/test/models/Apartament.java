package test.models;

public class Apartament extends Cladire{

    private Camera c1;
    private Camera c2;

    public Apartament(Camera c1, Camera c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Camera getC1() {
        return c1;
    }
    public void setC1(Camera c1) {
        this.c1 = c1;
    }
    public Camera getC2() {
        return c2;
    }
    public void setC2(Camera c2) {
        this.c2 = c2;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificarePret(int x, int y){
        this.c1.modificarePret(x,y);
        this.c2.modificarePret(x,y);
    }

    @Override
    public Cladire duplicare(){
        return new Apartament(this.c1, this.c2);
    }

    @Override
    public String toString() {
        String text = "";
        text += "C1: " + c1.toString() + "\n";
        text += "C2: " + c2.toString() + "\n";
        return text;
    }
}
