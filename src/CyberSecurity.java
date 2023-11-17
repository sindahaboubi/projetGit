public class CyberSecurity extends Personne {

    public CyberSecurity(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {

        return super.toString()+"  CyberSecurity";
    }

}