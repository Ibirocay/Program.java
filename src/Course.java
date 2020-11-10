public class Course {
    String[] students;
    String genre;
    int level;
    static final int PRICE = 1800;

    /** Denna metod skapar en instans (ett objekt)
     * returnerar denna
     * @return salsa
     */
    public static Course getSalsa(){
        Course salsa = new Course();
        salsa.level = 1;
        salsa.genre = "Salsa";
        salsa.students = new String[]{DanceStudio.dancers[0],DanceStudio.dancers[2],DanceStudio.dancers[4]};

        return salsa;
    }

    /** Denna metod skapar en instans (ett objekt)
     * och returnerar denna
     * @return bachata
     */
    public static Course getBachata(){
        Course bachata = new Course();
        bachata.level = 2;
        bachata.genre = "Bachata";
        bachata.students = new String[]{DanceStudio.dancers[1],DanceStudio.dancers[3],DanceStudio.dancers[5]};

        return bachata;
    }

    /** Denna metod skapar en instans (ett objekt)
     * och returnerar denna
     * @return kizomba
     */
    public static Course getKizomba(){
        Course kizomba = new Course();
        kizomba.level = 3;
        kizomba.genre = "Kizomba";
        kizomba.students = new String[]{DanceStudio.dancers[2],DanceStudio.dancers[5],DanceStudio.dancers[3]};

        return kizomba;
    }

    /** Denna metod printar ut i terminalen den sammanfattade infon för
     * respektive instans
     */
    public void print () {
        System.out.println("Kurs: " + genre.toUpperCase() + ", nivå " + level);
        System.out.println("Elever: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Pris: " + PRICE + " kr");
    }
}
