package repl.repl126_150;

public class Method_5_SimplePrintPattern_150 {
    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!(i > 0 && j > 0 && i < 4 && j < 4)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        printHollowRect();
    }
}

/*
 *****
 *   *
 *   *
 *   *
 *****
 */