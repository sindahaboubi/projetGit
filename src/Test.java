public class Test {

    public static void main(String[] args) {
        Personne[] personnes=new Personne[4];
        personnes[0]=new Personne("Salah", null, 0);
        personnes[2]=new ProductOwner("Chaima", null, 0);

        for(int i=0;i<personnes.length;i++) {
            System.out.println(personnes[i]);
        }

    }

}
