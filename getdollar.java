import java.util.Scanner;

public class getdollar{
    public static void main(String[] args){
        System.out.print("$1= 1200원입니다. 달러를 입력하세요 ");
        Scanner scanner = new Scanner(System.in);
        int dollar = scanner.nextInt();
        int won = dollar * 1200;
        System.out.println("$" + dollar + "는 " + won + "원입니다.");
    }
}