package uf3pràctica2_;

import java.util.ArrayList;
import java.util.List;

public class Lector {

    private List<Llibre> llibres;

    private final int maxLlibresPrestec = 3;

    public Lector(List<Llibre> llibres) {
        this.llibres = new ArrayList();
    }

    public List<Llibre> afegir(Llibre llibre) {
        if (!llibres.contains(llibre) && llibres.size() < maxLlibresPrestec) {
            llibres.add(llibre);
        }
        return llibres;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Llibre> llibres) {
        this.llibres = llibres;
    }

}
