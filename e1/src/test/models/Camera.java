package test.models;

public class Camera extends Cladire{

    private int pret;

    public Camera(int pret) {
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificarePret(int x, int y){
        this.pret+= x;
        this.pret-=y;
    }

    @Override
    public Cladire duplicare(){
        return new Camera(this.pret);
    }

    @Override
    public String toString() {
        String text = "";
        text += "Pret: " + pret + "\n";
        return text;
    }
}
