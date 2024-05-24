package test;

import test.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Punct p1 = new Punct(5, 10);
        Punct p2 = new Punct(10, 25);

        Traseu traseu = new Traseu(p1, p2);
        Destinatie destinatie = new Destinatie(p2, traseu);
        Vehicul vehicul = new Vehicul("Masina", p1 , p2);

        ArrayList<Elemente> list = new ArrayList<>();

        list.add(traseu);
        list.add(destinatie);
        list.add(vehicul);
        Calatorie calatorie= new Calatorie(list);

        calatorie.afisare();
    }
}