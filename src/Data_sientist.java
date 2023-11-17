public class Data_sientist extends Personne {

    public Data_sientist(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {

        return super.toString()+" Data scientist";
    }

}
