import com.pattern.Android;
import com.pattern.OS;
import com.pattern.OperatingFactory;
import com.pattern.Windows;

public class FactoryDesignPatter {
    public static void main(String[] args){
        OperatingFactory obj = new OperatingFactory();
        OS ob = obj.getInstance("Open");
        ob.show();

    }
}
