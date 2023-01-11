package ma.education.cigma.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Set<Voiture>set = new HashSet<>();
        set.add(new Voiture("A10",20.0));
        set.add(new Voiture("B20",30.0));
        set.add(new Voiture("A10",20.0));

       // System.out.println(set);

    }
}
