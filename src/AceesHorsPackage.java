import ma.education.tp1.introduction.Salle;


public class AceesHorsPackage extends Salle  {
    public AceesHorsPackage(long id, String nom) {
        super(id, nom);

    }

     public static void main(String[] args) {
        Salle s2 = new Salle(58, "Salle B");
        System.out.println("nom " + s2.nom);
        System.out.println("id : " + s2.id);
     }
    public  void afficher(Salle s) {
        System.out.println(s.id );
        System.out.println(s.nom );
        System.out.println(id );
        System.out.println(nom );

}
}





