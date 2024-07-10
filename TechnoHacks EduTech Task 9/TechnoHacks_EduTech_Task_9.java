import java.util.Random;//Random Class is imported.

import java.util.*;//Scanner class is oimported.

class TechnoHacks_EduTech_Task_9
{
    private static final String UpperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //The set of all the UPPER CASE LETTERS are stored in this string and this string is declared as final(so that the value of the string will not change).

    private static final String LowerCaseLetters = "abcdefghijklmnopqrstuvwzyz";
    //The set of all the Lower CASE LETTERS are stored in this string and this string is declared as final(so that the value of the string will not change).
    
    private static final String Numbers = "0123456789";
    //The set of all the NUMBERS are stored in this string and this string is declared as final(so that the value of the string will not change).
    
    private static final String SpecialCharacters = "!@#$%^&*()_+-=[];',./{}:<>?`~|";
    //The set of all the SPECIAL CHARACTERS are stored in this string and this string is declared as final(so that the value of the string will not change).


    //Function for creating a random PASSWORD is created.
    public static String generateRandomPassword(int length, boolean ans1, boolean ans2, boolean ans3, boolean ans4)
    {
        //A mutable empty string named "result" is formed through StringBuilder class.
        StringBuilder result = new StringBuilder();

        if(ans1)
        {
            result.append(UpperCaseLetters);
        }//If value of ans1 is true then all the Upper case letters are added to the "result" string. 

        if(ans2)
        {
            result.append(LowerCaseLetters);
        }//If value of ans2 is true then all the Lower case letters are added to the "result" string.
        
        if(ans3)
        {
            result.append(Numbers);
        }//If value of ans3 is true then all the Numbers are added to the "result" string.

        if(ans4)
        {
            result.append(SpecialCharacters);
        }//If value of ans4 is true then all the Special characters are added to the "result" string.

        if(result.length() == 0)
        {
            throw new IllegalArgumentException("At least one charcter must be present");
        }//If the length of the string is zero then an illegal exception will be thrown since password does not have 0 length.

        Random randomPassword = new Random();
        //The above Random object is used so as to generate random indices to select characters from "result".

        StringBuilder password = new StringBuilder();//Here the password will be stored as a mutable string.

        for(int i = 0; i < length; i++)
        {
            int index = randomPassword.nextInt(result.length());//A random indice is taken from the "result" string.

            password.append(result.charAt(index));//Then the character of that repective index will be appended to the resultant string which will store the password.
        }

        return password.toString();//The resultant string formed will be a mutable string. So to make it immutable we convert the formed password to String using toString() function.
    }

    public static void main(String args[])
    {
        System.out.println("----------R A N D O M   P A S S W O R D   G E N E R A T O R----------");

        Scanner sc = new Scanner(System.in);

        //Now we will enter the maximum length of the password.
        System.out.println("Enter the length of the password: ");
        int length = sc.nextInt();
        sc.nextLine();//Consume new line.

        //Now we will check whether we want UPPER CASE LETTERS in our password. Accordingly we will type "Yes / No".
        System.out.println("Do you want to include UPPER CASE LETTERS? (Yes / No)? ");
        boolean ans1 = sc.nextLine().equalsIgnoreCase("Yes");

        //Next we will check whether we want LOWER CASE LETTERS in our password. Accordingly we will type "Yes / No".
        System.out.println("Do you want tp include LOWER CASE LETTERS? (Yes / No)? ");
        boolean ans2 = sc.nextLine().equalsIgnoreCase("Yes");

        //Then we will check whether we want NUMBERS in our password. Accordingly we will type "Yes / No".
        System.out.println("Do you want to include NUMBERS? (Yes / No)? ");
        boolean ans3 = sc.nextLine().equalsIgnoreCase("Yes");

        //Lastly we will check whether we want SPECIAL CHARACTERS in our password. Accordingly we will type "Yes / No".
        System.out.println("Do you want to include SPECIAL CHARCTERS? (Yes / No)? ");
        boolean ans4 = sc.nextLine().equalsIgnoreCase("Yes");


        //Next, we will create a random password(String type) by creating a function which will generate the random password.
        String password = generateRandomPassword(length, ans1, ans2, ans3, ans4);
        System.out.println("The randomly generated PASSWORD is: " + password);//The random password formed will be printed.

        sc.close();//At the end, Scanner class gets closed.
    }
}