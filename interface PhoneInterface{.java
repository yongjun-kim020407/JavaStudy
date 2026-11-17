interface PhoneInterface{
    final int TIMEOUT = 10000; //상수 필드 선언
    void sendCall(); // 추상메소드
    void receiveCall(); // 추상 메소드
    defalut void printLogo (){
        System.out.println("**Phone**");
    }

}

class SamsungPhone implements PhoneInterface{
    //PhoneInterFace의 모든 추상 메소드 구현
    @Override
    public void sendCall(){
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall(){
        System.out.println("전화가 왔습니다.");
    }

    public void flash(){
        System.out.println("시스템에 불이 켜졌습니다.");
    }
}

public class InterfaceEx{
    public void main(String[] args){
        Samsungphone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.falsh();
    }
}