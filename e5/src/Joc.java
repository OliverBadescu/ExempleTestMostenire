import test.Elemente;

import java.util.ArrayList;

public class Joc extends Elemente {

    private ArrayList<Elemente> list;

    public Joc(ArrayList<Elemente> list) {
        this.list = list;
    }

    public ArrayList<Elemente> getList() {
        return list;
    }
    public void setList(ArrayList<Elemente> list) {
        this.list = list;
    }

    @Override
    public void afisare() {
        for(int i=0 ;i < list.size(); i++){
            list.get(i).afisare();
        }
    }

    @Override
    public void translatare(int x, int y) {
        for(int i=0 ;i < list.size(); i++){
            list.get(i).translatare(x,y);
        }
    }

    @Override
    public Elemente duplicare() {
        return new Joc(list);
    }
}
