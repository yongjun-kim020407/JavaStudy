public class Average{
    int[] intArray = new int[10];
    private int n = 0;
    
    public void put(int number){
        intArray[n++] = number;
    }
    public void showAll(){
        for(int i = 0; i<n; i++){
            System.out.print(intArray[i]+ " ");
        }
        System.out.println();
    }
    public double getAvg(){
        int sum = 0;
    
        for(int i= 0; i<intArray.length; i++){
            sum += intArray[i];
        }
        return (double)sum / (n);
    }

    public static void main(String[] args){
        Average avg = new Average();
        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.print("평균은 " + avg.getAvg());
    }
}