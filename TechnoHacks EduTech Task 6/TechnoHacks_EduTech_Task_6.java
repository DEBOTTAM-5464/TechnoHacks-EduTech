import java.util.*;//Scanner class is imported.

class TechnoHacks_EduTech_Task_6
{
    public static void main(String args[])
    {

        System.out.println("********** Q U I Z    G A M E **********");

        Scanner sc = new Scanner(System.in);//An object of Scanner class is created.

        String[] QuestionsOfQuiz = {
            "1. What is the ASCII range of UpperCase Letters? ",
            "2. What is the difference between the ASCII value of an UpperCase Letter and a LoweCase Letter? ",
            "3. Name the function which is used to produce a random number? ",
            "4. What is the capital of India? ",
            "5. What is the position of India in Economy all over the world? ",
            "6. Which is the biggest Sport in India? ",
            "7. Who is the present highest goalscorer in Football in the World? ",
            "8. Who was the first President of India? ",
            "9. Who wrote the series Harry Potter? ",
            "10. What is the chemical symbol of water? "
        };//Here we will create the Questions of the QUIZ GAME.

        String[][] OptionsOfQuiz = {
            {"A. 97 to 122","B. 48 to 57","C. 65 to 97","D. 0 to 9"},
            {"A. 0","B. 32","C. 65","D. 1"},
            {"A. Math.Random()","B. Math.ceil()","C. Math.floor()","D. Math.pow()"},
            {"A. New Delhi","B. Kolkata","C. Mumbai","D. Lucknow"},
            {"A. 1st","B. 2nd","C. 5th","D. 3rd"},
            {"A. Cricket","B. Football","C. Hockey","D. Kabaddi"},
            {"A. Lionel Messi","B. Neymar","C. Pele","D. Cristiano Ronaldo"},
            {"A. Dr.Pranab Mukherjee","B. Dr.Shayma Prasad Mukherjee","C. Dr.Rajendra Prasad","D. Shri Jawaharlal Nehru"},
            {"A. J.K.Rowling","B. Ruskin Bond","C. Christopher Nolan","D. William Shakespeare"},
            {"A. H2O","B. CO2","C. NH3","D. O2"}
        };//Here we will create the options for the QUIZ GAME.

        char AnswersOfQuiz[] = {'C','B','A','A','C','A','D','C','A','A'};
        //Here we will store the options of the QUIZ Questions.

        int score = 0;//Here we store the score of the QUIZ GAME achieved by the user.

        for(int i = 0; i < QuestionsOfQuiz.length; i++)
        {
            System.out.println(QuestionsOfQuiz[i]);//Each Question will be displayed.

            for(String option : OptionsOfQuiz[i])
            {
                System.out.println(option);
            }//Here we will display all the given options of that respective Question of that Quiz.

            System.out.println("Your answer is: ");
            char answer = sc.next().charAt(0);
            //Here we will store the user's answer of the question.

            if(Character.toUpperCase(answer) == AnswersOfQuiz[i])
            {
                System.out.println("Your answer is correct...");
                score += 1;
            }//If answer matches then it is correct and score will increase by 1.
            else
            {
                System.out.println("Your answer is incorrect...");
                System.out.println("The correct answer is: " + AnswersOfQuiz[i]);
                score -= 1;
            }//If answer does not matches then it is incorrect and score will decrease by 1.

            System.out.println();//Moves to the next line.
        }

        System.out.println("Your score is : " + score);//At the end the score of the user will be printed.

        sc.close();//Scanner class is closed.
    }
}