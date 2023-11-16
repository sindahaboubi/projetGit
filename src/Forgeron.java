public class Forgeron extends Personne {

    public Forgeron(String nom, String prenom, int age) {
        super(nom, prenom, age);

    }

    @Override
    public String toString() {

        return super.toString()+" un forgeron";
    }

}