import java.math.BigInteger;

public class BigIntegerMultiply {
    public static void main(String[] args){
        String s = "123456122" + "123411222";
        String second = "467780"+"4293979";
        BigInteger obj = new BigInteger(s);
        BigInteger obj1 = new BigInteger(second);
       BigInteger b = obj.multiply(obj1);
        System.out.println(b);
        String adding = "124887468683";
        String adding2 = "56868799798";
        BigInteger objw = new BigInteger(adding);
        BigInteger objl = new BigInteger(adding2);
       BigInteger l =  objw.add(objl);
        System.out.println(l);


    }
}
