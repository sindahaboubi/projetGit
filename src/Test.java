public class Test {

    public static void main(String[] args) {
        Personne[] personnes=new Personne[4];
        personnes[0]=new Personne("Salah");
        personnes[1]=new Forgeron("Ali");
        personnes[2]=new ProductOwner("Chaima");
        personnes[3]=new Forgeron("Amor");

        for(int i=0;i<personnes.length;i++) {
            System.out.println(personnes[i]);
        }

    }

}
