import java.util.Scanner;

public class BinarySearch {

    public static void Search(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Enter the required number: ");
        int requiredNumber = scanner.nextInt();
        Integer[] arr = InputArr();
        int length = arr.length;
        boolean isFound = false;
        int i = length / 2;
        int shift = length / 4;

        String result = "";
        while(!isFound){
            if(arr[i] > requiredNumber && i != 0){
                i -= shift;
            }
            else if(arr[i] < requiredNumber && i != length - 1){
                i += shift;
            }
            else if(arr[i] == requiredNumber){
                isFound = true;
                result = "This number is in the array!";
            }
            else{
                isFound = true;
                result = "Required number is not in the array.";
            }
            shift = Math.max(shift / 2, 1);
        }

        System.out.println(result);
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
