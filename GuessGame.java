import java.util.Scanner;

class Player {
    private String name;
    private int num;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수>>");
        int number = scanner.nextInt();
        Player[] pt = new Player[number];

        for (int i = 0; i < number; i++) {
            System.out.print("선수 이름>>");
            pt[i] = new Player(scanner.next());
        }
        String what = "yes";
        System.out.println("");
        while (what.equals("yes")) {
            int hiddenAnswer = (int) (Math.random() * 100 + 1);
            System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요. ");

            for (int i = 0; i < number; i++) {
                System.out.print(pt[i].getName() + ">>");
                pt[i].setNum(scanner.nextInt());
                System.out.println("");
            }

            System.out.print("정답은 " + hiddenAnswer);
            int[] intArray = new int[number];
            for (int i = 0; i < number; i++) {
                intArray[i] = Math.abs(hiddenAnswer - pt[i].getNum());
            }
            int min = 100;
            int a = 0;
            for (int i = 0; i < number; i++) {
                if (min >= intArray[i]) {
                    min = intArray[i];
                    a = i;
                }
            }
            System.out.print(pt[a].getName() + "이 이겼습니다. 승점 1점 확보!");
            pt[a].increaseScore();
            System.out.print("계속하려면 yes 입력>>");
            what = scanner.next();

        }
        for (int i = 0; i < number; i++) {
            System.out.print(pt[i].getName() + ":" + pt[i].getScore() + " ");
        }
        int max = 0;
        for (int i = 0; i < number; i++) {
            if (pt[max].getScore() < pt[i].getScore())
                max = i;
        }
        System.out.println(pt[max].getName() + "이 최종 승리하였습니다.");
    }
}