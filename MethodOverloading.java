public class MethodOverloading {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.disp(5, 2);

        obj.add(3, 2, 3);
        obj.add(1.2, 1.3);

        Casio obj1 = new Casio(2, 4);
        obj1.disp(4, 3);

        Casio obj2 = new Casio();
        obj2.disp(6, 4);
    }
}

class Casio {

    private int studentId;
    private int rollNo;

    Casio() {
        this.studentId = 1;
        this.rollNo = 2;
    }

    Casio(int a, int b) {
        this.studentId = a;
        this.rollNo = b;
    }

    public void disp(int i, int j) {
        System.out.println(i + " " + j);
        System.out.println("StudentID " + studentId);
        System.out.println("rollNo " + rollNo);
    }

    public void add(int l, int m, int n) {
        System.out.println(l + m + n);
    }

    public void add(double k, double w) {
        System.out.println(k + w);
    }

}