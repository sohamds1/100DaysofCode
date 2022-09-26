/*Implementation of ArrayList
 * Creating a menu program with the following options:
    a. Add Element
    b. Remove Element
    c. Display Elements
    d. Exit
 */

import java.util.*;

class ArrayJava{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        while(true)
        {
            System.out.println("Menu-driven program for ArrayList"
            +"\nEnter option accordingly:-"

            +"\n1. Add Element"
            +"\n2. Remove Element"
            +"\n3. Display Elements"
            +"\n4. Sort the Elements"
            +"\n5. Exit");

            int choice = sc.nextInt();

            if(choice==1){ 
                System.out.println("Enter an element: "); integers.add(sc.nextInt());
            }
            else if(choice==2){
                System.out.println("Enter index of element to be removed: "); integers.remove(sc.nextInt());
            }
            else if(choice==3)
                System.out.println(integers);
            else if(choice==4)
                Collections.sort(integers);
            else if(choice==5)
                System.exit(0);
            else
                System.out.println("Wrong Chocie");
        }
    }   
}
