
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows ;i++){
            for (int k = 1 ; k <= ((2*rows)-(2*i)) ; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = rows - 1 ; i >= 1 ; i--){
            for(int k = 1 ; k <= ((2*rows)-(2*i)); k++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= ((2*i) - 1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
