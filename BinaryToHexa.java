package logic;
import java.util.Scanner;
class BinaryToHexa
   {
                 Scanner scan;
	int num;
	public void getVal() {
                System.out.println("Binary to HexaDecimal");
		scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	    }
	public void convert() 
            {
                try{
                 String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
                }
                catch(NumberFormatException e){
                    System.out.println("only a binary number should be given");
                                    }
 
 }
    }
class Main_Class
 {
           public static void main(String... q) 
            {
            BinaryToHexa obj = new BinaryToHexa();
            obj.getVal();
            obj.convert();
            }
}