import java.util.Scanner;

class Dictionary{
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        for(int i =0; i<kor.length; i++){
            if(word.equals(kor[i])){
                return eng[i];
            }
        }
        return "사전에 없는 단어입니다.";

    }
}
public class DicApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        String what = " ";
        while(true){
            System.out.print("한글 단어?");
            what = scanner.next();
            if(what.equals("그만"))
                break;
            System.out.println(what + "은 " + Dictionary.kor2Eng(what));
        }
    }
}