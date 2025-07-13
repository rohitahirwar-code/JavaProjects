
import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("--TO DO LIST--");
        boolean check=true;
        do{
        System.out.println("1.Add task");
        System.out.println("2.Remove task");
        System.out.println("3.Show task");
        System.out.println("Enter your chioce: ");
        int ch=sc.nextInt();
        sc.nextLine();
        if(ch>0&& ch<4){
        switch(ch) {
            case 1:
                System.out.println("Enter task to add: ");
                String s = sc.nextLine();
                list.add(s);
                System.out.println(s + " task added sucessfully");
                break;
            case 2:
                if(list.isEmpty()==true ){
                    System.out.println("NO task to remove, Please add task first!");
                }
                else{
                System.out.println("Position no. of element you want to delete: ");
                int p = sc.nextInt();
                sc.nextLine();

                if(p>0 && p<=list.size()){
                list.remove(p - 1);
                System.out.println(p + "th task remove sucessfully");
                }
                else{
                    System.out.println("Invalid task number");
                }

                }
                break;
            case 3:
                if(list.isEmpty()==true){
                    System.out.println("No task to show, Please add task first!");
                }
                else {
                    System.out.println("Task left: ");
                    for (String i : list) {
                        System.out.println(i);
                    }
                    break;
                }
//            default:
//                System.out.println("Choose correct choice");

    }
        }
        else {
            System.out.println("Enter valid Choose!");
        }

    System.out.println("Enter true to continue: and false for exit");
         check=sc.nextBoolean();
         sc.nextLine();
            System.out.println();
        }while(true);

}
}
