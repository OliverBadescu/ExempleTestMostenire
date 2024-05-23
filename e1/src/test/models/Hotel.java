package test.models;

public class Hotel extends Cladire{
    private Camera c1;
    private Camera c2;
    private Camera c3;
    private Camera c4;
    private int etaje;

    public Hotel(Camera c1, Camera c2, Camera c3, Camera c4, int etaje) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.etaje = etaje;
    }

    public Camera getC1() {
        return c1;
    }
    public void setC1(Camera c1) {
        this.c1 = c1;
    }
    public Camera getC4() {
        return c4;
    }
    public void setC4(Camera c4) {
        this.c4 = c4;
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
    public int getEtaje() {
        return etaje;
    }
    public void setEtaje(int etaje) {
        this.etaje = etaje;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void modificarePret(int x, int y) {
        this.c1.modificarePret(x,y);
        this.c2.modificarePret(x,y);
        this.c3.modificarePret(x,y);
        this.c4.modificarePret(x,y);
    }

    @Override
    public Cladire duplicare(){
        return new Hotel(this.c1, this.c2, this.c3, this.c4, this.etaje);
    }

    @Override
    public String toString() {
        String text = "";
        text += "C1: " + this.c1.toString() + "\n";
        text += "C2: " + this.c2.toString() + "\n";
        text += "C3: " + this.c3.toString() + "\n";
        text += "C4: " + this.c4.toString() + "\n";
        text+= "Etaje: " + this.etaje + "\n";
        return text;

    }

}
