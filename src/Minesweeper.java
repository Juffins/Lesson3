import java.util.Scanner;

public class Minesweeper {

    public static void Play(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of rows, count of cols and count of mines:");
        int countOfRows = scanner.nextInt();
        int countOfCols = scanner.nextInt();
        int countOfMines = scanner.nextInt();


        String[][] field = new String[countOfRows][countOfCols];
        int currentRowsCoordinates;
        int currentColsCoordinates;
        String mine = "*";
        String emptyCell = ".";

        System.out.println("In the next " + countOfMines + " lines, enter the location of the mines.");
        for(int i = 0; i < countOfMines; i++){

            currentRowsCoordinates = scanner.nextInt() - 1;
            currentColsCoordinates = scanner.nextInt() - 1;
            if(currentRowsCoordinates > countOfRows - 1 || currentColsCoordinates > countOfRows - 1){
                System.out.println("The mines are out of bounds! Enter correct values.");
                i--;
                continue;
            }
            field[currentRowsCoordinates][currentColsCoordinates] = mine;
        }

        int currentCountSurroundingMines;
        for(int r = 0; r < countOfRows; r++){
            for(int c = 0; c < countOfCols; c++){
                currentCountSurroundingMines = 0;

                if(!field[r][c].equals(mine)){
                    try{
                        if(field[r - 1][c - 1].equals(mine)) currentCountSurroundingMines++; //Проверка левой верхней ячейки на наличие мины
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r - 1][c].equals(mine)) currentCountSurroundingMines++; //Проверка ячейки сверху
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r - 1][c + 1].equals(mine)) currentCountSurroundingMines++; //Проверка правой верхней ячейки
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r][c - 1].equals(mine)) currentCountSurroundingMines++; //Проверка ячейки слева
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r][c + 1].equals(mine)) currentCountSurroundingMines++; //Проверка ячейки справа
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r + 1][c - 1].equals(mine)) currentCountSurroundingMines++; //Проверка нижней левой ячейки
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r + 1][c].equals(mine)) currentCountSurroundingMines++; //Проверка нижней ячейки
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }
                    try{
                        if(field[r + 1][c + 1].equals(mine)) currentCountSurroundingMines++; //Проверка нижней правой ячейки
                    }catch (Exception e){
                        System.out.print("Out of bounds.\t");
                    }

                    if(currentCountSurroundingMines == 0){
                        field[r][c] = emptyCell;
                    }
                    else{
                        field[r][c] = String.valueOf(currentCountSurroundingMines);
                    }
                }
            }
        }

        System.out.println("\nResult:");
        for(int r = 0; r < countOfRows; r++){
            for(int c = 0; c < countOfCols; c++){
                System.out.print(field[r][c] + " ");
            }
            System.out.println();
        }

    }
}
