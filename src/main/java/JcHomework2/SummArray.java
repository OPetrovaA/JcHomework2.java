package JcHomework2;

public class SummArray {
    public static void main(String[] args) throws MyArrayDataException {

        String[][] str = {
                {"1", "1", "1", "k"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try { // попробовать код
            check(str);
        } catch (MyArrayDataException e){  //поймать исключение (пишем искл, к-е ловим)
                System.out.println(e);
            }
        }

        static void check(String[][] str) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
             try {
                 sum += Integer.valueOf(str[i][j]);
             } catch (NumberFormatException e) {
                 throw new MyArrayDataException(" " + i + " "+ j); // выбросить исключение (что именно выбросить)
             }


            }
        }
            System.out.println("Сумма ровна " + sum);

    }
}



