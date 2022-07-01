
import java.util.List;

public class Student {

    public String name;
    public String surname;
    public double marksAverage;

    public Student(String name, String surname, double marksAverage) {
        this.name = name;
        this.surname = surname;
        this.marksAverage = marksAverage;
    }

    public Student() {
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double sum = 0.0;
        for (Number number : listOfMarks) sum += number.doubleValue();
       return sum;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}
