import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("luisa","verdi",1.0);
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(30.50);
        individualMarksListLisa.add(10.50);
        double sum = Student.getAverageMark(individualMarksListLisa);
        System.out.println("primo valore delle lista " + individualMarksListLisa.get(0));
        System.out.println(student + " calcolo voti : " + sum);


         double div = sum / individualMarksListLisa.size();
         System.out.println("divisione media voto: " + div);
        //todo: ottenuta la media di lista


        System.out.println("--------------");

         Student student1 = new Student("carlo","rossi",3);
         List<Integer> projectMarksListJeremy = new ArrayList<>();
         projectMarksListJeremy.add(10);
         projectMarksListJeremy.add(30);
         double sum1 = Student.getAverageMark(projectMarksListJeremy);
         System.out.println("secondo valore della lista " + projectMarksListJeremy.get(1));
         System.out.println(student1 + " calcolo voti " + sum1);

         double div1 = sum1 / projectMarksListJeremy.size();
         System.out.println("divisione media voto :" + div1);
         //todo: ottenuta la media di mark


        }




    }


