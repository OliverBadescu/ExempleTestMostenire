package test.models;

public class Casa extends Cladire{

    private Camera c1;
    private Camera c2;
    private Camera c3;

    public Casa(Camera c1, Camera c2, Camera c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
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
    public Camera getC3() {
        return c3;
    }
    public void setC3(Camera c3) {
        this.c3 = c3;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificarePret(int x, int y){
        this.c1.modificarePret(x, y);
        this.c2.modificarePret(x, y);
        this.c3.modificarePret(x, y);
    }

    @Override
    public Cladire duplicare(){
        return new Casa(this.c1, this.c2, this.c3);
    }

    @Override
    public String toString() {
        String text = "";
        text += "C1: " + c1.toString() + "\n";
        text += "C2: " + c2.toString() + "\n";
        text += "C3: " + c3.toString() + "\n";
        return text;
    }
}
