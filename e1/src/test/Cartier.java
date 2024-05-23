package test;

import jdk.jfr.BooleanFlag;
import test.models.Cladire;

import java.util.ArrayList;

public class Cartier extends Cladire {

    private ArrayList<Cladire> list;

    public Cartier(ArrayList<Cladire> list) {
        this.list = list;
    }

    public ArrayList<Cladire> getList() {
        return list;
    }
    public void setList(ArrayList<Cladire> list) {
        this.list = list;
    }

    @Override
    public void afisare(){
        for(int i =0; i < list.size(); i++){
            list.get(i).afisare();
        }
    }

    @Override
    public void modificarePret(int x, int y){
        for(int i =0; i < list.size(); i++){
            list.get(i).modificarePret(x, y);
        }
    }

    @Override
    public Cladire duplicare(){
        return new Cartier(this.list);
    }


}
