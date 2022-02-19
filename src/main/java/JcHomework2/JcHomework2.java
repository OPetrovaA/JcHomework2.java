package JcHomework2;
/*
Homework 2
@author Petrova Olya
 */

public class JcHomework2 {

    public static void aRray(String [][] str) throws MyArraySizeException {

        if (str.length != 4) {
            throw new MyArraySizeException();
        }
        for(int i = 0; i < str.length; i++) {
            if (str[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
    }
    public static void main(String[] args) throws MyArraySizeException {

        String[][] str = {
                {"h", "o", "h", "1"},
                {"h", "o", "2", "o", "4"},
                {"h", "3", "h", "o"},
                {"4", "o", "h", "o"}
        };

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

        aRray(str);

        if (str.length != 4) {
             throw new MyArraySizeException();
        }
                for(int i = 0; i < str.length; i++) {
                        if (str[i].length != 4) {
                            throw new MyArraySizeException();
                        }
                }
        }
    }


