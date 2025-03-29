package ObjectOriented;//define folder 

public class object {//class in java
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);

        student s1 = new student();
        s1.setName("John");
        s1.calculate(85, 90, 95);
        System.out.println("Student Name: " + s1.name);
        System.out.println("CGPA: " + s1.CGPA);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class student{
    String name;
    int age;
    float CGPA;
    void calculate(int phy, int chem, int math){
        CGPA = (phy + chem+ math) /3;
    }
    void setName(String newName){
        name = newName;
    }
}