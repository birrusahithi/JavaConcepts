import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarComparator {
    int number;
    String carname;
    long price;

    CarComparator(int num, String carname, long p) {
        this.number = num;
        this.carname = carname;
        this.price = p;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarComparator{" +
                "number=" + number +
                ", carname='" + carname + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        CarComparator obj = new CarComparator(3, "Honda", 100);
        CarComparator obj1 = new CarComparator(1, "Toyota", 130);
        CarComparator obj2 = new CarComparator(10, "Aunty", 101);
        List<CarComparator> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);

    }

}
