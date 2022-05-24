package uf3pràctica2_;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Llibre> copies;

    public Biblioteca(List<Llibre> copies) {
        this.copies = new ArrayList<>();
    }

    public List<Llibre> getCopies() {
        return copies;
    }

    public void setCopies(List<Llibre> copies) {
        this.copies = copies;
    }
    
    
}
