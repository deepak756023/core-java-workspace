package Practice;

public class PerfectNum {
    public static void main(String[] args) {
        int num = 496;
        int temp = num;
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        if(sum == temp){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
