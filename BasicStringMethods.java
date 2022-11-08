public class BasicStringMethods {
    public static void main(String[] args){
        String s = "Sahithi, Ankith";
        String [] arr = s.split(",");
        String k = s.substring(2);
        System.out.println(k);
        String l = s.substring(2, 5);
        System.out.println(l);
     int i = s.indexOf('i');
        System.out.println(i);


    }
}
