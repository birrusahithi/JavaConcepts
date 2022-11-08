import java.util.Comparator;

public class NameComparator implements Comparator<CarComparator> {

    @Override
    public int compare(CarComparator o1, CarComparator o2) {
        return o1.getCarname().compareTo(o2.getCarname());
        }
    }

