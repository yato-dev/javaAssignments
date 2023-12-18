public class PowerOf2{

    public static void main( String[] args)
    {
        int n = Integer.parseInt(args[0]); // taking input as command line argument


        if( n<0 || n>31)// condition check for invalid inputs
        {
            System.out.println("Invalid input");
            return;
        }


        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}