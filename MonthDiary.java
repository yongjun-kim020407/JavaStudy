import java.util.Scanner;

class DayDiary{
    private String todo = " ";

    public void setTodo(String todo){
        this.todo = todo;
    }
    public String getTodo(){
        return todo;
    }

}
public class MonthDiary{
    private int year, month, day;
    
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void write(){
        System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
        setDay(scanner.nextInt());
        dayArray[getDay()].setTodo(scanner.next());        
    }
    public void show(){
        for(int i = 0; i < dayArray.length; i++){
            System.out.print(dayArray[i].getTodo() + "  ");

            if((i + 1) % 7 == 0){
                System.out.println();
            }
        }
    }
    public void getMenu(){
        System.out.print("프로그램을 종료합니다.");
    }
    DayDiary[] dayArray = new DayDiary[30]; // 30개의 객체 배열 생성 
    public MonthDiary(int year, int month){
        this.year = year;
        this.month = month;

        for(int i = 0; i<dayArray.length; i++){
        dayArray[i] =  new DayDiary();
    }
    }
    
    Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("***** 2024년 10월 다이어리 *****");
        int putnumber;
        do{
            System.out.print("기록:1, 보기:2, 종료:3>>" );
            putnumber = scanner.nextInt();
            if(putnumber == 1){
                write();
            }
            else if(putnumber == 2){
                show();
            }
            else if(putnumber == 3){
                getMenu();
            }
            else{
                System.out.print("다른 번호를 입력하세요.");
            }
        }while(putnumber != 3);
    }
    
    
    public static void main(String[] args){
        MonthDiary monthDiary = new MonthDiary(2024, 10); //2024년 10월 다이어리
        monthDiary.run();
    }
}  