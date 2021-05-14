import java.util.ArrayList;

public class Students {

    long id;
    String name;
    ArrayList<Integer> grades;

    public Students(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public long getId(){
        return id;
    }
//
    public String getName(){
        return name;
    }
//
    public void addGrade(int grade){
        grades.add(grade);
    }
//
    public ArrayList<Integer> getGrades(){
        return grades;
    }
//
//    public double getGradeAverage(){
//        double sum = 0;
//        for(int i = 0; i < grades.size(); i++){
//            sum = sum + grades.get(i);
//        }
//        return sum / grades.size();
//    }
//
}
