class CharToString {
    public void charToString(char[] a) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            res.append(a[i]);
        }
    }

    public static void main(String[] args) {
        char[] a = {'S', 'A', 'H', 'I', 'T', 'H', 'I'};
        CharToString obj = new CharToString();
       obj.charToString(a);

    }
}