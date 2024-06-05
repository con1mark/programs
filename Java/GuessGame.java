import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = (int)(Math.random()*100) +1;
        int c = 0;
        do {
            System.out.println("Guess a number : ");
            int n = sc.nextInt();
            if(guess == n){
                System.out.println("7 corore rupaye jeet gaye ap ");
                break;
            }
            ++c;
            if (c>=10){
                System.out.println("na babu tumse na ho payega");
                break;
            }
            if (guess>n){
                System.out.println("bada guess karo");
            }
            else {
                System.out.println("chhota guess karo");
            }
        }while (true);
    }
}
