
public class Main {
    public static void main(String[] args) {
        // 이름: 본인 이름
        // 학번: 본인 학번

        String text1 = "Hello, Java! Hello World.";
        String text2 = "Java is fun. Hello, Java!";

        char[] delimiters = {
            '(', ')', ',', '.', '!', '?', '"', '\''
        };

        // WordsCounter 객체 생성
        WordsCounter counter =
            new WordsCounter(text1, delimiters);

        // 첫 번째 텍스트의 단어 출력
        if (counter.hasWords()) {
            System.out.println(counter);
        }

        // 두 번째 텍스트의 단어도 기존 배열에 추가
        counter.splitWords(text2);

        // 누적된 단어와 횟수 출력
        if (counter.hasWords()) {
            System.out.println(counter);
        }
    }
}
