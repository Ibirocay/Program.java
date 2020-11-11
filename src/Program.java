import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        DanceStudio studio = new DanceStudio();
        System.out.println("Welcome to The DanceStudio!" +
                "\nExit with CTRL+Z or CTRL+D (Win) CMD+D (Mac)");
        System.out.println("What class list are you looking for? Salsa, Bachata or Kizomba? ");

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String input = scan.nextLine();
            Course searchedCourse = studio.getCourseWithGenre(input);
            if (searchedCourse != null){
                searchedCourse.print();
            }
            else {
                System.out.println("The system couldn't find " + input +
                "\nPlease only use these search words: Salsa, Bachata or Kizomba");
            }
        }
    }
}
