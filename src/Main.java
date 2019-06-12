
import java.util.*;





    public class Main implements Comparable {
        public int progres;
        public String last_name;
        public String first_name;
        public int Group;

        public Main(int progres, String last_name, String first_name, int Group) {
            this.progres = progres;
            this.last_name = last_name;
            this.first_name = first_name;
            this.Group = Group;
        }


        public int compareTo(Object obj) {
            Main tmp = (Main) obj;
            if (this.progres < tmp.progres) {

                return -1;
            } else if (this.progres > tmp.progres) {

                return 1;
            }
            return 0;
        }

        public static void main(String[] args) {


            Main[] students = new Main[10];
            students[0] = new Main(5, "Ivan",    "Petrov",    3);
            students[1] = new Main(4, "Lisa",    "Miluoki",   4);
            students[2] = new Main(1, "Kate",    "Jons",      3);
            students[3] = new Main(5, "Andrey",  "Martynov",  1);
            students[4] = new Main(3, "Maya",    "Radeckaya", 4);
            students[5] = new Main(1, "Johns",   "Marvil",    1);
            students[6] = new Main(3, "Kiril",   "Rudyi",     3);
            students[7] = new Main(4, "Anton",   "Malec",     3);
            students[8] = new Main(1, "Marina",  "Alesova",   1);
            students[9] = new Main(1, "Ira",     "Markina",   4);


            Arrays.sort(students);



            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].progres+" " +
                        students[i].last_name+" " + students[i].first_name+" " +students[i].Group);
            }
            System.out.println();
            for (int i=0; i<students.length; i++){
                if(students[i].progres == 4 || students[i].progres == 5){
                    System.out.println(students[i].progres+" " +
                            students[i].last_name+" " + students[i].first_name+" " +students[i].Group);
                }
            }
        }
    }

