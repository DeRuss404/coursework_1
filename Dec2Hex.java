//Daniel Russell

//Imports
//import java.util.Scanner;

//Main class
class Dec2Hex
{
    //declaration of class attributes
    private static int Arg1;
    //private static Scanner scr1;

    //main method
    public static void main(String[] args)
    {
        
        //declaration of method attributes
	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        String hexadecimal=""; 
        
        //if condition to check size and type of input
        if (args.length >= 1) 
        {
            try 
            {
                Arg1 = Integer.parseInt(args[0]);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        else
        {
            System.err.println("NULL Argument, unable to convert to Hexadecimal");
            System.exit(1);
        }

        //sets num after if check
	num = Arg1;
        
        //console output confirming input
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        //while conversion of decimal integer "num" into a hexadecimal represented as a string
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        //final console confirming success
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }
}
