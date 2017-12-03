package com.company;

import java.util.ArrayList;


public class Magazyn {

    //Lista przedmiotow:
    private ArrayList<Przedmiot> przedmioty = new ArrayList<Przedmiot>();

    //metoda:
    public void dodaj(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
    }

    public ArrayList<Przedmiot> pobierzPrzedmioty(){
        return przedmioty;
    }
}
