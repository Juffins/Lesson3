import java.util.Scanner;

public class ArrayReverse {

    public static void Reverse(){

        Integer[] arr = InputArr();
        int length = arr.length;
        int temp;
        for(int i = 0; i < length / 2; i++){
            temp = arr[i];
            arr[i] = arr[length - i -1];
            arr[length - i -1] = temp;
        }

        for(int i = 0; i< length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static Integer[] InputArr(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array of numbers: ");
        String inputLine = scanner.nextLine();
        String[] arr = inputLine.split(" ");
        int length = arr.length;
        Integer[] intArr = new Integer[length];
        for(int i = 0; i < length; i++){
            try {
                intArr[i] = Integer.valueOf(arr[i]);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return intArr;
    }
}
