package test.models;

public class Masura extends Elemente{

    private int masura;

    public Masura(int masura) {
        this.masura = masura;
    }

    public int getMasura() {
        return masura;
    }
    public void setMasura(int masura) {
        this.masura = masura;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificareOctava(int x, int y){}

    @Override
    public Elemente duplicare(){
        return new Masura(this.masura);
    }

    @Override
    public String toString(){
        String text = "";
        text += "Masura: " + this.masura + "\n";
        return text;
    }
}
