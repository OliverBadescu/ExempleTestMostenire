package test.models;

public class Departament extends Elemente{
    private Raion raion;
    private String departament;

    public Departament(Raion raion, String departament) {
        this.raion = raion;
        this.departament = departament;
    }

    public Raion getRaion() {
        return raion;
    }
    public void setRaion(Raion raion) {
        this.raion = raion;
    }
    public String getDepartament() {
        return departament;
    }
    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int x, int y){
        raion.translatare(x, y);
    }

    @Override
    public Elemente duplicare(){
        return new Departament(raion, departament);
    }

    @Override
    public String toString() {
        String text = "";
        text += raion.toString();
        text += "Departament" + departament + "\n";
        return text;
    }
}
