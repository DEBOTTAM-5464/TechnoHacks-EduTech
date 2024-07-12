import java.util.*;//Scanner class in imported.

class TechnoHacks_EduTech_Task_4
{
    public static void main(String args[])
    {
        System.out.println("----------S I M P L E   T O - D O   L I S T----------");

        Scanner sc = new Scanner(System.in);//An object of Scanner class is taken.

        ToDoList obj = new ToDoList();//An object of ToDoList is created.

        while(true)//The process of ToDoList will keep on executing until and unless the condition inside while becomes false.
        {
            //Here we perform the operations of ToDoList program.
            System.out.println("1. Add Task to the List. ");
            System.out.println("2. Remove Task from the List. ");
            System.out.println("3. Display all the Tasks in the List. ");
            System.out.println("4. Exit.");

            System.out.println("Enter the choice: ");//Here we enter our choice.
            int choice = sc.nextInt();
            sc.nextLine();//Consumes newLine.

            switch(choice)
            {
                case 1 : System.out.println("Enter the Task to be added to the List: ");
                         String task = sc.nextLine();
                         sc.nextLine();
                         obj.addTask(task);
                         break;//Here a task will be added to the List.

                case 2 : System.out.println("Enter the Task Number to be removed: ");
                         int number = sc.nextInt();
                         obj.removeTask(number - 1);
                         break;//Here a task will be removed form the List.

                case 3 : obj.viewListDetails();
                         sc.close();
                         return;//Here the List will be displayed.

                case 4 : System.out.println("Exiting...");
                         break;//Here we will exit from the program.

                default : System.out.println("Invalid Choice...");//If none of the above choice matches with the user choice then it returns an "Invalid chocie..."
            }
        }
    }
}

