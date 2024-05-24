package test;

import test.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        NotaMuzicala n1 = new NotaMuzicala("Do", 25);
        NotaMuzicala n2 = new NotaMuzicala("Re", 50);

        Acord acord = new Acord(n1, n2);
        Interval interval = new Interval(n1, n2);
        Masura masura = new Masura(50);

        ArrayList<Elemente> list = new ArrayList<>();
        list.add(acord);
        list.add(interval);
        list.add(masura);
        Cantec cantec = new Cantec(list);

        cantec.afisare();



    }
}