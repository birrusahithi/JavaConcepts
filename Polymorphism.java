//Run time polymorphism
//Hierarchical inheritance
class Mom {
    int a;
    char ch;

    Mom(int num) {
        this.a = num;
    }

    Mom(int num, char c) {
        this.a = num;
        this.ch = c;
    }

    void Print() {
        System.out.println("Mummy class");
    }

}

class Daughter extends Mom {
    int a;
    String name;

    public Daughter() {
        super(1);
    }

    Daughter(int num) {
        super(num);
    }

    Daughter(int num, String str) {
        super(num, 'a');
        this.a = num;
        this.name = str;

    }


    @Override
    void Print() {
        System.out.println("Daughterclass");
    }
}

class Son extends Mom {
    Son(int num) {
        super(num, 'b');

    }

@Override
    void Print() {
        System.out.println("Son class");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Mom a = new Daughter();
        a.Print();
        a.Print();
        a.Print();

    }
}
















/* Compile time polymorphism
class Practice4

{
    static int multiply(int a, int b){
        return a*b;
    }
    static double multiply(double a, double b){
        return a*b;
    }

}




public class Polymorphism {
    public static void main(String [] args){
        Practice4.multiply(1,2);
        Practice4.multiply(2.2, 3.3);
        System.out.println(Practice4.multiply(1,2) + ""+
        Practice4.multiply(2.2, 3.3));
    }
}
*/
