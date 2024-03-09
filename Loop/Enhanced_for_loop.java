package Loop;
public class Enhanced_for_loop {
    public static void main(String[] args) {
        int nums[] = { 5, 3, 4, 6 };

        int abc[][] = {
                { 3, 9 }, { 5, 4 }, { 2, 7 }
        };

        int xyz[][] = { { 3, 9, 5, 7 }, { 5, 4 }, { 2, 7, 1 } };

        System.out.println("USING ENHANCED FOR LOOP");
        System.out.println("normal array");

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("2d array");

        for (int x[] : abc) {
            for (int b : x) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("jagged array");

        for (int y[] : xyz) {
            for (int c : y) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
