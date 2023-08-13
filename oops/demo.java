package oops;

class students{
    
String name;
int rollNumber;
int age;
}
public class demo {
    
    public static void main(String[] args){
        students s1 = new students();
        s1.name = "ranvir";
        s1.rollNumber = 23;
        s1.age= 24;
        System.out.println(s1.name + " " + s1.age);

    }
    
}
