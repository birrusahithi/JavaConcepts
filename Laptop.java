import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop implements Comparable<Laptop>{
    int lid;
    String name;
    Laptop(int l, String n){
        this.lid = l;
        this.name = n;
    }
    public int getLid(){
        return lid;
    }
    public String getName()
    {
        return name;
    }
    public int compareTo(Laptop ls){
        if(ls.lid<lid){
            return 1;
        }else if(ls.lid>lid){
            return -1;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){
        Laptop obj = new Laptop(10, "Dell");
        Laptop obj1 = new Laptop(1, "Lenovo");
        Laptop obj2 = new Laptop(4, "MacBook");
        List<Laptop> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
