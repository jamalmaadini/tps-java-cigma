package ma.education.cigma.collection;

public class Voiture {
    String matricule;
    double poids ;
    Voiture(String matricule, double poids){
        this.matricule=matricule;
        this.poids=poids;

    }

    @Override
    public String toString() {
        return "Voiture{" +
                "matricule='" + matricule + '\'' +
                ", poids=" + poids +
                '}';
    }
}
