class SmartTV extends ColorTV{
    private String address;
    public SmartTV(String address, int size, int color){
        super(size, color);
        this.address = address;
    }
    @Override
    public void printProperty(){
        System.out.println(address + " 주소의 " + size + "인치 " + color + " 컬러 TV");
    }   
}

public class SmartPrint{
    public static void main(String[] args){
        SmartTV sm  = new SmartTV("192.168.0.5" , 77, 2000000);

        sm.printProperty();
    }
}