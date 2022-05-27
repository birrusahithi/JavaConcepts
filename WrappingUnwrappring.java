public class WrappingUnwrappring {
    public static void main(String[] args) {
        //Wrapping
        byte a = 1;
        char b = 'v';
        int c = 21;
        float d = 2.1f;
        double e = 123;
        Double oy4 = new Double(e);
        Byte oy = new Byte(a);
        Float oy3 = new Float(d);
        Integer oy2 = new Integer(c);
        Character oy1 = new Character(b);
        System.out.println("byte object: " + a);
        System.out.println("char object: " + b);
        System.out.println("int object: " + c);
        System.out.println("float object: " + d);
        System.out.println("double object: " + e);
        //Unwrapping
        byte ab = oy;
        char as = oy1;
        int in = oy2;
        float fl = oy3;
        double dl = oy4;
        System.out.println("byte Object to primitive: " +ab);
        System.out.println("char Object to primitive: "+ as);
        System.out.println("int Object to primitive: " + in);
        System.out.println("float Object to primitive: " + fl);
        System.out.println("double Object to primitive: " + dl);
    }
}
