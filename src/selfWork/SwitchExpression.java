package selfWork;

public class SwitchExpression {
    public static void main(String[] args) {
        char grade = 'A';
       String result = switch (grade){
            case 'A'-> "Excellent";
            case 'B', 'C' -> "Pass";
           default -> "Failed";
        };
        System.out.println(result);
    }
}
