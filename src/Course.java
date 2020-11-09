public class Course {
    int index;
    int level;
    String[] genres;
    static final int PRICE = 1800;
    String[] students;

    public static Course getSalsa(){
        Course salsa = new Course();
        salsa.index = 0;
        salsa.level = 1;
        salsa.genres = DanceSchool.genres;
        salsa.students = DanceSchool.students;

        return salsa;
    }
    public static Course getBachata(){
        Course bachata = new Course();
        bachata.index = 1;
        bachata.level = 2;
        bachata.genres = DanceSchool.genres;
        bachata.students = DanceSchool.students;

        return bachata;
    }
    public static Course getKizomba(){
        Course kizomba = new Course();
        kizomba.index = 2;
        kizomba.level = 3;
        kizomba.genres = DanceSchool.genres;
        kizomba.students = DanceSchool.students;

        return kizomba;
    }

    public static void print (Course c) {
        //Course salsaCourse = Course.getSalsa();
        System.out.println("Kurs: " + c.genres[c.index] + ", nivå " + c.level);
        System.out.println("Elev: " + c.students[c.index]);
        System.out.println("Pris: " + Course.PRICE);

       /* Course bachataCourse = Course.getBachata();
        System.out.println("Kurs: " + bachataCourse.genres[1] + ", nivå " + bachataCourse.level);
        System.out.println("Elev: " + bachataCourse.students[0]);
        System.out.println("Pris: " + Course.PRICE);

        Course kizombaCourse = Course.getKizomba();
        System.out.println("Kurs: " + kizombaCourse.genres[2] + ", nivå " + kizombaCourse.level);
        System.out.println("Elev: " + kizombaCourse.students[0]);
        System.out.println("Pris: " + Course.PRICE);

        */
    }
}
