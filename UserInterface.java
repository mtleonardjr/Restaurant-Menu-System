package cosc436_assignment_4;

import java.util.Scanner;

//author: Michael Leonard

public class UserInterface 
{
 
  public static void displayOptions()
  {
    System.out.println("\nSelect from the following options"
                         +"\n1: Exit Program"
                         +"\n2: Display Menu"
                         +"\n3: Submit Order"
                         +"\n4: Display Tab");
  }
  
  public static void inputOptions()
  {
    Scanner input = new Scanner(System.in);
    SystemInterface sysInt = new SystemInterface();
    sysInt.setInvoker(new Invoker(new Aggregator()));
    int selection = input.nextInt();
    int orderNumber;
    
    while(selection !=1)
    {
      switch(selection)
      {
        case 2: 
          System.out.println(sysInt.getMenu());
          break;
        case 3:
          System.out.println("Enter menu item number: ");
          orderNumber = input.nextInt();
          System.out.println(sysInt.submitOrder(orderNumber));
          break;
        case 4:
          System.out.println(sysInt.getTab());
          break;
      }   
    displayOptions();
    selection = input.nextInt();
    }
  }
  
  
 
}
