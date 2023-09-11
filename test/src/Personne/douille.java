package Personne;

public class douille extends Personne {

    public String CauseDouille;

    public douille(int age, String nom, String causeDouille){
        Age = age;
        Nom = nom;
        CauseDouille = causeDouille;
    }

    public douille(Personne nouvDouille, String causeDouille){
        Age = nouvDouille.Age;
        Nom = nouvDouille.Nom;
        CauseDouille = causeDouille;
    }

    @Override
    public void quiEsTu() {
        super.quiEsTu();
        System.out.println(CauseDouille);
    }

}
