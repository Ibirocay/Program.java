public class DanceStudio {
    public static String[] dancers = {"Ibirocay Regueira", "Hanna Wiberg", "Alvin Alsén", "Luis Ramos", "Lisa Sjögren", "Lilla Lily"};
    public Course[] courses = {Course.getSalsa(),Course.getBachata(),Course.getKizomba()};

    /** This method returns a course IF the search matches
     * the course requested in main. Otherwise it returns null
     * @param dance dance style
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

