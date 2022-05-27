import com.sun.org.apache.xpath.internal.objects.XString;

class Student {
    private int Rollno;
    private int Age;
    private String Name;

    public void setRollno(int rollno) {
        Rollno = rollno;

    }

    public void setAge(int studentage) {

        Age = studentage;
    }

    public void setName(String studentname) {
        Name = studentname;
    }

    public int getRoll() {
        return Rollno;
    }

    public int getAge() {
        return Age;
    }

    public String getname() {
        return Name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(12);
        obj.setName("Ankith");
        obj.setRollno(2);
    }

}