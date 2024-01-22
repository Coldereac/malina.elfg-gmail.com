package main.day19.Battleship;
/*
0 - ничего
1 - есть корабль
2 - мимо
-1 уничтоженный корабль
 */
public class Field {
    private static int[][] field = new int[10][10];

    public void print(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                switch (field[i][j]){
                    case 0 -> System.out.print("⬜");
                    case 1 -> System.out.print("\uD83D\uDEE5");
                    case -1 -> System.out.print("\uD83D\uDFE5");
                    case 2 -> System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int x, int y, int value) {
        this.field[x][y] = value;
    }
}
