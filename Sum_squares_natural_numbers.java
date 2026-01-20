import java.util.Scanner;

public class Sum_squares_natural_numbers {
     public static int summation(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += (i * i);

        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
        System.out.println(summation(num));
        sc.close();
    }
}
