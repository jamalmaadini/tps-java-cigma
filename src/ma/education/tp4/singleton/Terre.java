package ma.education.tp4.singleton;

public class Terre {
   public static double distanceToSoleil;
    public double surface;
    private static Terre instance;

    private Terre(double distanceToSoleil, double surface) {
        Terre.distanceToSoleil = distanceToSoleil;
        this.surface = surface;
    }
        public static Terre getInstance (double surface){
            if (instance == null)
                instance = new Terre(distanceToSoleil, surface);
            return instance;
        }



}
