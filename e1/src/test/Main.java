package test;

import test.models.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Camera c1 = new Camera(200);
        Camera c2 = new Camera(400);
        Camera c3 = new Camera(600);
        Camera c4 = new Camera(800);

        Apartament apartament = new Apartament(c1, c2);
        Casa casa = new Casa(c2, c3, c4);
        Hotel hotel = new Hotel(c1, c2, c3, c4, 5);

        ArrayList<Cladire> list = new ArrayList<>();
        list.add(casa);
        list.add(hotel);
        list.add(apartament);

        Cartier c = new Cartier(list);

        c.modificarePret(0,200);
        c.afisare();


    }
}