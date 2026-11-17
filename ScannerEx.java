import java.util.Scanner;

public class ScannerEx{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        while(true){
            System.out.print("양의 정수 입력>>");
            x = scanner.nextInt();
            if(x > 0)
                break;
            else
                continue; 
        }

        for(int i=0; i<x; i++){
            for(int j = x; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        } 
    
    }
}