import java.util.Scanner;

public class Sum_natural_numbers {
    static int findSum(int num){
        int sum = 0;
        for (int i= 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    } 
     public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
        System.out.println("The sum is : "+findSum(num));
        sc.close();
    } 
}
