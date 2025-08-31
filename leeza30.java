//array list challange
 import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class leeza30{

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag=true;
        ArrayList<String> groceries=new ArrayList<>();
        while(flag){
            printAction();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1 ->AddItem(groceries);
                 case 2 ->RemoveItem(groceries);
                default->flag=false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
     }
    private static void AddItem(ArrayList<String> groceries){
        System.out.println("Add Item(s) [seprated Item by comma]");
        String[] items=scanner.nextLine().split(",");
      
       for(String i: items){
        String trimmed=i.trim();
        if(groceries.indexOf(trimmed)<0){
            groceries.add(trimmed);
        }
       }
    } 
     private static void RemoveItem(ArrayList<String> groceries){
        System.out.println("remove Item(s) [seprated Item by comma]");
        String[] items=scanner.nextLine().split(",");
       for(String i: items){
        String trimmed=i.trim();
       groceries.remove(trimmed);
        
    }}
   private static void printAction(){
        String textBlock="""
                0-to shutdown

                1-to add item(s) to list (comma delimted list)

                2-to remove item(s) to list (comma delimted list)

                """;
                System.out.println(textBlock+" ");
    }
}  