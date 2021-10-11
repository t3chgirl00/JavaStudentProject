import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> grade1 = List.of(34.6, 78.9, 67.8, 65.7);
        List<Double> grade2 = List.of(89.0, 90.0, 96.9, 99.5);
        List<Double> grade3 = List.of(67.9, 34.9, 89.9, 56.2);
        List<Double> grade4 = List.of(67.9, 34.9, 89.9, 56.2);
        List<Double> grade5 = List.of(67.9, 34.9, 89.9, 56.2);
        List<INameable> listOfStudents = new ArrayList<>();
        Student student1 = new Student(grade1, "Adelaide", Level.LEVEL1);
        Student student2 = new Student(grade2, "Romeo", Level.LEVEL3);
        Student student3 = new Student(grade3, "Raymond", Level.LEVEL2);
        Student student4 = new Student(grade4, "Ama", Level.LEVEL2);
        Student student5 = new Student(grade5, "Abena", Level.LEVEL1);

        listOfStudents.add(student1);
        listOfStudents.add(student3);
        listOfStudents.add(student2);
        listOfStudents.add(student4);
        listOfStudents.add(student5);


        Register register = new Register(listOfStudents);
        System.out.println(register.getRegisterByLevel(Level.LEVEL2));
        register.printReport();
        System.out.println(register);
//
//        NaughtyStudent naughtyStudent1 = new NaughtyStudent(grade1);
//
//
//        System.out.println(naughtyStudent1);
//
//        System.out.println("Naughty Keziah's average grade is " + naughtyStudent1.getAverageGrade());
//        System.out.println("Naughty Keziah's inflated grades are " + naughtyStudent1.inflatedGrades());
//        System.out.println("Naughty Keziah's average grade is " + naughtyStudent1.getInflatedAverages());

    }
}
