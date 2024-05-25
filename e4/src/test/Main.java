package test;

import test.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produse p1 = new Produse(5,10);
        Produse p2 = new Produse(5,20);

        Rafturi r1 = new Rafturi(p1, p2);
        Rafturi r2 = new Rafturi(p2, p1);

        Raion raion = new Raion(r1, r2);
        Departament departament = new Departament(raion, "test");

        ArrayList<Elemente> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(r1);
        list.add(r2);
        list.add(raion);
        list.add(departament);


        Magazin magazin = new Magazin(list);

        magazin.afisare();




    }
}