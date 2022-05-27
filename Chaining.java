class Chain1 {
    int num;
    int id;
    String name;

    Chain1() {
        System.out.println("Excite");
    }

    Chain1(int a, int b) {
        this();
        System.out.println("Excitement");
        this.num = a;
        this.id = b;
    }
}

class Chain2 extends Chain1 {
    int rollno;
    String name;

    Chain2() {
        System.out.println("excited");
    }

    Chain2(String nameone) {
        super(1, 2);
        this.name = nameone;
        System.out.println("Sahithi");

    }
}

public class Chaining {
    public static void main(String[] args) {
        Chain2 obj = new Chain2("True");
        System.out.println(obj.name);
        System.out.println(obj.num);

    }

}
