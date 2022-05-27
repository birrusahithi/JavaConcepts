class Constructor {
    int id;
    String college;
    char grade;
    static String name = "Sahi";

    Constructor(int d, String n) {
        this.id = d;
        this.college = n;
    }
    Constructor(int d, String s, char c){
        this.id = d;
        this.college= s;
        this.grade=c;

    }

    public void display() {
        System.out.println(id + " " + college + " " + name);
    }
    public void displayTwo(){
        System.out.println(id+" "+ college + " "+ name+" "+ grade);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(12, "KDG");
        Constructor obj1 = new Constructor(13, "GHJ");
        Constructor obj2 = new Constructor(14,"ASF", 'A');
        obj.display();
        obj1.display();
        obj2.displayTwo();

    }
}