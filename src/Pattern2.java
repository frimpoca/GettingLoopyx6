public class Pattern2 { // Begin - class
    public static void main(String [] args) // Begin - main()
    {
        int num = 5; // since you want 5 as the max value for *
        for (int i=num; i>=0; i--) { // start with high to low
// watch out for j<=i, the pattern should print until i only
            for(int j=1; j<=i; j++) {
                System.out.print(" * "); // watch out for print here, println is not used
            }
            System.out.print("\n"); // new line
//num--;
        }
    }
} // End - class