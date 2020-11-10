import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        DanceStudio studio = new DanceStudio();
        System.out.println("Välkommen till DanceStudio!" +
                "\nAvsluta med CTRL+Z eller CTRL+D (Win) CMD+D (Mac)");
        System.out.println("Vilken kurslista vill du titta på? Salsa, Bachata el. Kizomba? ");

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            Course search = studio.getCourseWithGenre(input);
            if (search != null){
                search.print();
            }
            else {
                System.out.println("Systemet hittade inte " + input +
                "\nAnvänd endast sökord: Salsa, Bachata el. Kizomba");
            }
        }
    }
}
