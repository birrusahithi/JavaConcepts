public class WrappingUnwrappring {
    public static void main(String[] args) {
        //Wrapping
        byte a = 1;
        char b = 'v';
        int c = 21;
        float d = 2.1f;
        double e = 123;
        Double dlo = new Double(e);
        Byte by = new Byte(a);
        Float flo = new Float(d);
        Integer ints = new Integer(c);
        Character chars = new Character(b);
        System.out.println("byte object: " + a);
        System.out.println("char object: " + b);
        System.out.println("int object: " + c);
        System.out.println("float object: " + d);
        System.out.println("double object: " + e);
        //Unwrapping
        byte ab = by;
        char as = chars;
        int in = ints;
        float fl = flo;
        double dl = dlo;
        System.out.println("byte Object to primitive: " + ab);
        System.out.println("char Object to primitive: " + as);
        System.out.println("int Object to primitive: " + in);
        System.out.println("float Object to primitive: " + fl);
        System.out.println("double Object to primitive: " + dl);
    }
}
