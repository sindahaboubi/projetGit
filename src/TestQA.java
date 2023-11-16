
public class TestQA extends Personne {
	
	public TestQA(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
	
    @Override
    public String toString() {

        return super.toString()+" une testeuse QA";

    }

}
