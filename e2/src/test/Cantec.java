package test;

import test.models.Elemente;

import java.util.ArrayList;

public class Cantec extends Elemente {

    private ArrayList<Elemente> list;

    public Cantec(ArrayList<Elemente> list) {
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
        for(int i =0 ; i < list.size();i++){
            list.get(i).afisare();
        }
    }

    @Override
    public void modificareOctava(int x, int y){
        for(int i =0 ; i < list.size();i++){
            list.get(i).modificareOctava(x, y);
        }
    }

    @Override
    public Elemente duplicare(){
        return new Cantec(list);
    }
}
