public class Cube{

    private int width, height, howtall;

    public Cube(int width, int height, int howtall){
        this.width = width;
        this.height = height;
        this.howtall = howtall;    
    } 
    
    public int getVolume(){
        return width * height * howtall;
    }

    public void increase(int width, int height, int howtall){
        this.width += width;
        this.height += height;
        this.howtall += howtall;
    }

    public boolean isZero(){
        if(height*width*howtall== 0){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        Cube cube = new Cube(1,2,3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1,2,3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if(cube.isZero())
            System.out.println("큐브의 부피는 0");
        else
            System.out.println("큐브의 부피는 0이 아님");
        
    }

}

