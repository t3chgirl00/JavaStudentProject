import java.util.List;
import java.util.stream.Collectors;

public class NaughtyStudent extends Student {


    public NaughtyStudent(List<Double> grade) {
        super(grade, "Keziah", Level.LEVEL2);
    }


    public double getInflatedAverages() {
        double averageGrade = super.getAverageGrade();
        double newAverage = ((averageGrade * 10) / 100 + averageGrade);
        return newAverage;
    }

    public List<Double> inflatedGrades() {
        List<Double> inflatedGrade = super.studentGrade.stream().map((e) -> e + (e * 0.10)).collect(Collectors.toList());
        return inflatedGrade;
    }
}
