public class reverse {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("tony");
        for(int i=0; i<s.length()/2; i++) {
            int front = i;
            int back =s.length() - 1 - i;
           char charfront = s.charAt(front);
           char charback = s.charAt(back);
            s.setCharAt(front, charback);

            s.setCharAt(back, charfront);
        }
        System.out.println(s);
    }
}
