package test.models;

public class NotaMuzicala extends Elemente{

    private String nota;
    private int octava;

    public NotaMuzicala(String nota, int octava) {
        this.nota = nota;
        this.octava = octava;
    }

    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    public int getOctava() {
        return octava;
    }
    public void setOctava(int octava) {
        this.octava = octava;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void modificareOctava(int x, int y){
        this.octava += x;
        this.octava -= y;
    }

    @Override
    public Elemente duplicare(){
        return new NotaMuzicala(this.nota, this.octava);
    }

    @Override
    public String toString(){
        String text = "";
        text += "Nota: " + this.nota + "\n";
        text+= "Octava: " + this.octava +"\n";
        return text;
    }

}
