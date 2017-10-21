package zodiac.definition;

public class TUT {

    private String courseCode;
    private String tutCode;
    private List<Student> students;


    /**
     * Initialize the class with given information.
     */
    public TUT(String courseCode, String tutCode, List<Student> students) {
        this.courseCode = courseCode;
        this.tutCode = tutCode;
        this.students = students;
    }

    /**
     * get the code of course
     *
     * @return the code of course
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * set the code of course
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * set the name of class.
     */
    public void seTutCode(String tutCode) { this.tutCode = tutCode; }

    /**
     * get the name of class.
     *
     * @return the name of class
     */
    public String getTutCode() {
        return this.tutCode;
    }

    /**
     * set a list of Students.
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * get a list of Students of class.
     *
     * @return list of students
     */
    public List<Student> getStudents() {
        return this.students;
    }
}

