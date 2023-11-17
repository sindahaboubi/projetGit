public class ProductOwner extends Personne {

    public ProductOwner(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {

        return super.toString()+" Product Owner";

    }
}