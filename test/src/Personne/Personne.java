package Personne;
public class Personne {
    public int Age;
    public String Nom;

    public Personne(){}
    public Personne(int age, String nom){
        Nom = nom;
        Age = age;
        return;
    }
    public void quiEsTu(){
        System.out.printf("Je m'appel: " + Nom + " et j'ai " + Age + " ans\n" );
    }

    public void changeNom(String nom) { Nom = nom;}

}