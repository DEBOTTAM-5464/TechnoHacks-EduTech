import java.util.*;

class TechnoHacks_EduTech_Task_8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("------C O N V E R T E R------");
        System.out.println("1. Convert from Binary to Decimal. ");
        System.out.println("2. Convert from Decimal to Binary. ");
        System.out.println("3. EXIT. ");

        System.out.println("Enter the choice: ");//Here we have to enter my choice.
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 : System.out.println("Enter the Binary number: ");//Here we will enter the binary number in String format.
                     String binary = sc.next();
                     try
                     {
                        int decimal = Integer.parseInt(binary, 2);//Here we will convert the binary number in String format to decimal number in Integer format.
                        System.out.println("The number in Decimal form is: " + decimal);//Print the binary number in decimal form.
                     }
                     catch(NumberFormatException e)//If the number is not entered in binary format then NumberFormatException will occur and will be caught in the catch block.
                     {
                        System.out.println("Invalid binary number....");
                     }
                     break;

            case 2 : System.out.println("Enter the Decimal number: ");//Here we will enter the decimal number in Integer form.
                     int decimal1 = sc.nextInt();
                     String binary1 = Integer.toBinaryString(decimal1);//We will convert the decimal number to binary number in String format.
                     System.out.println("The number in Binary from is: " + binary1);
                     break;

            case 3 : System.out.println("EXITING...");//We will be exiting from the program.
                     break;

            default : System.out.println("Invalid choice...");
        }

        sc.close();//Scanner class in closed.
    }
}