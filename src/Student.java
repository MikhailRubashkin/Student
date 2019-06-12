public class Student implements Comparable {

    private Integer progress;
    private String lastName;
    private String firstName;
    private int group;

    public Student(Integer progress, String lastName, String firstName, int group) {
        this.progress = progress;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
    }

    public Integer getProgress() {
        return progress;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGroup() {
        return group;
    }

    public boolean isGoodStudent() {
        return progress >= 4;
    }

    @Override
    public int compareTo(Object obj) {
        Student student = (Student) obj;
        return this.progress.compareTo(student.progress);
    }

    @Override
    public String toString() {
        return "Student{" +
                "progress=" + progress +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", group=" + group +
                '}';
    }
}
