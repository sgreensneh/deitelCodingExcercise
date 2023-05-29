public class CharTest {
    public static void main(String[] args) {

        char s = 'e';
        int num = s;
        System.out.println(s);
        System.out.println(num);

        String word = "SGreen";
        System.out.println(word.charAt(1));

        String coordinate = "00";
        int see = coordinate.charAt(0);
        System.out.println(see);

        System.out.println(Integer.parseInt(String.valueOf(coordinate.charAt(0))));
    }
}
