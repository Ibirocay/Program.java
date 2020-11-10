public class DanceStudio {
    public static String[] dancers = {"Ibirocay Regueira", "Hanna Wiberg", "Alvin Alsén", "Luis Ramos", "Lisa Sjögren", "Lilla Lily"};
    public Course[] courses = {Course.getSalsa(),Course.getBachata(),Course.getKizomba()};

    /** Denna metod returnerar en kurs OM sökningen matchar namnet
     * på kursen som efterfrågas i main. I annat fall returnerar den null
     * @param dance dansstil
     * @return course el. null
     */
    public Course getCourseWithGenre (String dance){
        for (Course course : courses)
        {
            if (dance.equalsIgnoreCase(course.genre)){
                return course;
            }
        }
        return null;
    }
}

