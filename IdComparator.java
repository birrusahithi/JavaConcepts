import java.util.Comparator;

public class IdComparator implements Comparator<CarComparator> {


    @Override
    public int compare(CarComparator o1, CarComparator o2) {
        if (o1.getNumber() < o2.getNumber()) return -1;
        if (o1.getNumber() > o2.getNumber()) return 1;
        else return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
