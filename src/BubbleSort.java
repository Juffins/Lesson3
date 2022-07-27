import java.util.Scanner;

public class BubbleSort {

    public static void Sort(){

        Integer[] arr = InputArr();
        int length = arr.length;
        int temp;
        Boolean isWasReplacement = true;

        while (isWasReplacement){
            isWasReplacement = false;
            for(int i = 0; i < length - 1; i++){
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isWasReplacement = true;
                }
            }
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
