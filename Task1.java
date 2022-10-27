package GroupProject;

public class Task1 {
    /*We have to calculate the average of marks obtained in three subjects by student A and by  student B. Create class
  Marks' with an abstract method 'getPercentage' that will be returning  the average percentage of marks.
   Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
   three subjects as its parameters and the marks in four subjects as its parameters for  student B. Test your code
   */

    public static void main(String[] args) {
        A student=new A(78,95,100);
        student.print();

        B studentB=new B(92,96,99,100);
        studentB.print();
    }
}
abstract class Marks{
    public abstract double getPercentage();
}
class A extends Marks {
    int marks1,marks2,marks3;

    A(int marks1, int marks2, int marks3) {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public double getPercentage(){
        double avePercentage=((marks1+marks2+marks3)/(float)3);
        return avePercentage;
    }
    void print (){
        System.out.println("Average Marks in percentage for Student A is "+getPercentage());
    }
}
class B extends Marks{
     int marks1,marks2,marks3,marks4;

      B(int marks1, int marks2, int marks3, int marks4) {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
    }


    @Override
    public double getPercentage() {
        double avePercentage=((marks1+marks2+marks3+marks4)/(float)4);
        return avePercentage;
    }
    void print (){
        System.out.println("Average Marks in percentage for Student B is "+getPercentage());
}}


