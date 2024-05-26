import test.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Jucator p1 = new Jucator(15, 20);

        Arma arma = new Arma(p1);
        Armura armura = new Armura(p1);
        Minigame minigame = new Minigame(arma,armura,p1);

        ArrayList<Elemente> list = new ArrayList<>();

        list.add(arma);
        list.add(armura);
        list.add(minigame);

        Joc joc = new Joc(list);

        joc.afisare();

    }
}