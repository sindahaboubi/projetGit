public class Personne {

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom=prenom;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Je suis " + nom + " "+prenom + " et j'ai "+ age +" ans";
    }
}
