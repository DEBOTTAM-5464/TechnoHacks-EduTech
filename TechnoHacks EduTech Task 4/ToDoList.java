import java.util.ArrayList;//ArrayList class has been invoked.

public class ToDoList
{
    private ArrayList<String> tasks;//A variable 'tasks' of datatype ArrayList<String> is declared as private.

    public ToDoList()//A parameterized constructor of ToDoList class is created.
    {
        tasks = new ArrayList<>();
    }    

    public void addTask(String task)
    {
        tasks.add(task);//add() function is used to add something to a list. 
        System.out.println("Task added is : " + task);
    }//The operation of adding a task to a list is created.

    public void removeTask(int index)
    {
        if(index >= 0 && index < tasks.size())
        {
            System.out.println("Task removed is: " + tasks.remove(index));//remove() is used to remove something from a list.
        }
        else
        {
            System.out.println("Invalid Task index...");
        }
    }//The operation of removing a task from a list is created.

    public void viewListDetails()
    {
        if(tasks.isEmpty())//isEmpty() function checks whether a list is empty.
        {
            System.out.println("No such Task is present in the List...");
        }
        else
        {
            System.out.println("The tasks present in the List are: ");
            for(int i = 0; i < tasks.size(); i++)
            {
                System.out.println((i + 1) + " " + tasks.get(i));
            }//The details of the List if displayed accordingly.
        }
    }//The operation of displaying a list is created.
}