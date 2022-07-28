import java.util.Scanner;

public class Spiral {

    public static void CreateSpiralArray(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int arrSize = scanner.nextInt();
        Integer[][] arr = new Integer[arrSize][arrSize];

        int k = 1;
        int bound = arrSize;
        int r;
        int c;
        arr[0][0] = 1;
        while(bound - 1 > 0){
            c = arrSize - bound;
            r = arrSize - bound;
            while(c < bound){
                arr[r][c] = k;
                k++;
                c++;
            }
            c--;
            r++;
            while(r < bound){
                arr[r][c] = k;
                k++;
                r++;
            }
            r--;
            c--;
            while(c > arrSize - bound - 1){
                arr[r][c] = k;
                k++;
                c--;
            }
            c++;
            r--;
            while(r > arrSize - bound){
                arr[r][c] = k;
                k++;
                r--;
            }
            bound = bound - 1;
        }

        for(int i = 0; i < arrSize; i++){
            for(int j = 0; j < arrSize; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
