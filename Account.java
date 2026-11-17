public class Account{
    private int havemoney;

    public Account(int havemoney){
        this.havemoney = havemoney;
    }
    public void deposit(int money){
        havemoney += money;
    }
    public int getBalance(){
        return havemoney;
    }
    public void deposit(int[] money){
        for(int i= 0; i<money.length; i++){
            havemoney += money[i];
        }
    }
    public int withdraw(int money){
        if(havemoney >= money){
            havemoney -= money;
            return money;
        }
        else{
            int x = havemoney;
            havemoney = 0;
            return x;
        }
    }

    public static void main(String[] args){
        Account a = new Account(100);
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance() +"원 입니다.");

        int bulk[] = { 100, 500, 200, 700 };
        a.deposit(bulk);
        System.out.println("잔금은 " + a.getBalance() + "원 입니다.");

        int money = 1000;
        int wMoney = a.withdraw(money);
        if(wMoney < money )
            System.out.println(wMoney + "원만 인출"); // 잔금이 1000원보다 작은 경우
        else
            System.out.println(wMoney + "원 인출");
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}