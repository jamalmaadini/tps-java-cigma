package ma.education.cigma.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Voiture>l = new ArrayList<>();
        l.add(new Voiture("A10",20.0));
        l.add(new Voiture("B20",30.0));
        l.add(new Voiture("A10",20.0));
       // l.add(new Voiture(new Voiture("A40",40.0),1));
        System.out.println(l);
    }
}
