public class TV{
    String name;
    int size, price;

    public TV(String name, int size, int price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    void show(){
        System.out.print(name+ "에서 만든 " + price + "만원짜리의 " + size + "인치 TV");
    }
    public static void main(String[] args){
        TV tv = new TV("Samsung", 50, 300);
        tv.show();
    }

}

