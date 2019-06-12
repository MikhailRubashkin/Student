import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Student [] students = new Student [10];
        students[0] = new Student(5, "Ivan",    "Petrov",    3);
        students[1] = new Student(4, "Lisa",    "Miluoki",   4);
        students[2] = new Student(1, "Kate",    "Jons",      3);
        students[3] = new Student(5, "Andrey",  "Martynov",  1);
        students[4] = new Student(3, "Maya",    "Radeckaya", 4);
        students[5] = new Student(1, "Johns",   "Marvil",    1);
        students[6] = new Student(3, "Kiril",   "Rudyi",     3);
        students[7] = new Student(4, "Anton",   "Malec",     3);
        students[8] = new Student(1, "Marina",  "Alesova",   1);
        students[9] = new Student(1, "Ira",     "Markina",   4);

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

        for (Student student : students) {
            if (student.isGoodStudent()) {
                System.out.println(student.toString());
            }
        }
    }
}
