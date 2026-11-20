public class Str {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("tony");
        System.out.println(s);

        System.out.println(s.charAt(0));

        s.setCharAt(0,'p');
        System.out.println(s);

    }
}
