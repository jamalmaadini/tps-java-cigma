package ma.education.tp1.introduction;

public class AccesSamePackage {
    public static void main(String[] args) {
        Salle s1 = new Salle(50 , "Salle A");
        System.out.println(s1.nom );
        System.out.println(s1.id);
    }
}
