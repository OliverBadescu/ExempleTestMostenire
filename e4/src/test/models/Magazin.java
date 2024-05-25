package test.models;

import java.util.ArrayList;

public class Magazin extends Elemente {
    private ArrayList<Elemente> list;

    public Magazin(ArrayList<Elemente> list) {
        this.list = list;
    }

    public ArrayList<Elemente> getList() {
        return list;
    }
    public void setList(ArrayList<Elemente> list) {
        this.list = list;
    }

    @Override
    public void afisare(){
        for(int i =0; i < list.size(); i++){
            list.get(i).afisare();
        }
    }

    @Override
    public void translatare(int x, int y){
        for(int i =0; i < list.size(); i++){
            list.get(i).translatare(x, y);
        }
    }

    @Override
    public Elemente duplicare(){
        return new Magazin(list);
    }


}
