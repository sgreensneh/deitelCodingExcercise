package dsa;


public class ClassWork {
    public static void main(String[] args) {
        String[] words = {"Ab1396", "Q2RBS", "G381AC"};
        System.out.println(countArray(words));

    }

    public static int countArray(String[] words) {
        int count = 0;
        for (String n : words) {
            for (int i = 0; i < n.length(); i++) {
                if (Character.isDigit(n.charAt(i))) {
                    count++;
                }
            }
        }
        return count;

    }


//    public static int number(String[] arr) {
//        int count = 0;
//        for (String n : arr) {
//            for (int i = 0; i < n.length(); i++) {
//                if (Character.isDigit(n.charAt(i))) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
