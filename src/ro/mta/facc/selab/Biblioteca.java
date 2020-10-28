package ro.mta.facc.selab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> lista_carti;

    public void sort()
    {
        Collections.sort(lista_carti);
    }

    public Biblioteca() {
        lista_carti = new ArrayList<Carte>();
    }

    public void add(Carte carte)
    {
        lista_carti.add(carte);
    }

    public void removeBook(Carte c)
    {
        lista_carti.remove(c);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for (Carte c : lista_carti)
        {
            builder.append(c.toString());
            builder.append('\n');
        }

        return builder.toString();
    }
}
