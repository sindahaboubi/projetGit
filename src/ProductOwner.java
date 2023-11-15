public class ProductOwner extends Personne {

    public ProductOwner(String nom) {
        super(nom);
    }

    @Override
    public String toString() {

        return super.toString()+" Product Owner";

    }
}