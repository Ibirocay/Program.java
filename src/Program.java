import javax.swing.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        System.out.println("Välkommen till DanceStudio!" +
                "\nVilken kurslista vill du titta på? Salsa, Bachata el. Kizomba? " +
                "\nAvsluta med CTRL+Z eller CTRL+D (Win) CMD+D (Mac)");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String s = "Salsa";
        String b = "Bachata";
        String k = "Kizomba";

      if (input.equalsIgnoreCase(s)) {
          Course s1 = Course.getSalsa();
          Course.print(s1);
      }
        else if(input.equalsIgnoreCase(b)) {
          Course b1 = Course.getBachata();
          Course.print(b1);
        }
        else if(input.equalsIgnoreCase(k)) {
          Course k1 = Course.getKizomba();
          Course.print(k1);
      }
        else {
            System.exit(0);
        }



        //System.out.println(s);
        /*int tal = 0;
        while (true){

                if (tal <= 3) {
               }
                else  
                try{

                     System.out.println("Du har angett " + tal);
            }catch (InputMismatchException e){
                System.out.println("Ej heltal! Försök igen!");
                scanner.next();
            }catch (NoSuchElementException e){
                System.out.println("Hej då");
                System.exit(0);
                */
        //System.out.println(n);
    }
}
