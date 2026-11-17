class TV{
    public int size;
    public TV(int size){this.size = size;}
    protected int getsize(){ return size; }
}

class ColorTV extends TV{
    public int color;
    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public void printProperty(){
        System.out.println(size + "인치" + color +"컬러");
    }

}
public class PrintTV{
    public static void main(String[] args){
        ColorTV myTv = new ColorTV(65, 65536);
        myTv.printProperty();
    }
}