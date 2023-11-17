public class Menuisier extends Personne {

    public Menuisier(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {

        return super.toString()+" le menuisier";

    }
}