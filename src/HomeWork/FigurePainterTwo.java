package HomeWork;

public class FigurePainterTwo {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("------------------------------");

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int z = 0; z < 4; z++) {
            for (int j = 0; j < z; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k > z; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

