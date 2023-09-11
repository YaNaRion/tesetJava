import Personne.Personne;
import Personne.douille;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Integer add(Integer i, int j) {
        i = i + j;
        return i;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        Integer testParametre = 5;

        System.out.println(testParametre);

        testParametre = add(testParametre, 8);

        System.out.println(testParametre);

        Personne yann = new Personne(20, "Yann");

        yann.quiEsTu();

        Personne YannCopy = yann;


        YannCopy.changeNom("Big Yanny");

        YannCopy.quiEsTu();

        yann.quiEsTu();

        douille yanarion = new douille(yann, "il est moche");

        yanarion.quiEsTu();
        /*
        comme YannCopy est juste une copie de référence, on ne fait pas une deep copy, mais on copy uniquement la référence donc YannCopie et Yann référence la même mémoire


        */
    }
}