public class Course {
    String[] students;
    String genre;
    int level;
    static final int PRICE = 1800;

    /** This method creates an instance (an object)
     * and returns it
     * @return salsa
     */
    public static Course getSalsa(){
        Course salsa = new Course();
        salsa.level = 1;
        salsa.genre = "Salsa";
        salsa.students = new String[]{DanceStudio.dancers[0],DanceStudio.dancers[2],DanceStudio.dancers[4]};

        return salsa;
    }

    /** This method creates an instance (an object)
     * and returns it
     * @return bachata
     */
    public static Course getBachata(){
        Course bachata = new Course();
        bachata.level = 2;
        bachata.genre = "Bachata";
        bachata.students = new String[]{DanceStudio.dancers[1],DanceStudio.dancers[3],DanceStudio.dancers[5]};

        return bachata;
    }

    /** This method creates an instance (an object)
     * and returns it
     * @return kizomba
     */
    public static Course getKizomba(){
        Course kizomba = new Course();
        kizomba.level = 3;
        kizomba.genre = "Kizomba";
        kizomba.students = new String[]{DanceStudio.dancers[2],DanceStudio.dancers[5],DanceStudio.dancers[3]};

        return kizomba;
    }

    /** This method prints the collected info
     * for each instance to the terminal
     */
    public void print () {
        System.out.println("Class: " + genre.toUpperCase() + ", level " + level);
        System.out.println("Students: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Price: " + PRICE + " kr");
    }
}
