import java.util.List;

public class Student implements INameable, HasLevel {
    protected List<Double> studentGrade;
    private final String name;
    private Level level;

    public Student(List<Double> grade, String name, Level level) {
        studentGrade = grade;
        this.name = name;
        this.level = level;
    }


    public double getAverageGrade() {
        double sum = studentGrade.stream().mapToDouble(Double::doubleValue).sum();
        double average = sum / studentGrade.size();
        return average;
    }

    @Override
    public String toString() {
        return (name + "'s " + "grades = " + studentGrade + "\n");
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public Level getLevel() {
        return this.level;
    }
}
