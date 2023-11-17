public class Main {

    public static void main(String[] args) {
        Personne[] personnes=new Personne[5];
        personnes[2]=new Menuisier("Rebhi","Rebhi",21);
        personnes[4]=new TestQA("Haboubi","Sinda",22);

        for(int i=0;i<personnes.length;i++) {
            System.out.println(personnes[i]);
        }

    }

}
