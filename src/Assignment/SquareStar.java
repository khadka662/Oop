package Assignment;

public class SquareStar {

    static void print_rectangle(int k, int l)
    {
        int a, b;


        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= l; b++) {

                if (a == 1 || a == k || b == 1 || b == l)


                    System.out.print("*");
                else


                    System.out.print(" ");
            }

            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
    }


    public static void main(String args[])
    {


        // Custom input initialization values
        int rows = 8, columns = 22;


        print_rectangle(rows, columns);
    }
}


