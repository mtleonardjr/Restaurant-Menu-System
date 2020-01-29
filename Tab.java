package cosc436_assignment_4;
import java.util.ArrayList;
import java.util.ListIterator;

//author: Michael Leonard

public class Tab
{
  private ArrayList<MenuItem> menu = new Menu().getMenu();
  private ArrayList<OrdersItem> tab;
  
  //constructor
  public Tab(Orders orders)
  {
    tab = orders.getTab();
    menu = new Menu().getMenu();
  }
  
  //This method will display all items in the tab
  public String displayTab()
  {
    ListIterator<OrdersItem> itr = tab.listIterator();
    int orderNumber;
    while(itr.hasNext())
    {
      orderNumber = itr.next().getOrder();
      System.out.println(itemFinder(orderNumber));
    }
    return "Tab has been displayed";
  }
  
  //This method matches an item number with its appropriate
  //menu item. There has got to be a more elegant way to 
  //make this work
  public String itemFinder(int itemNumber)
  {
    ListIterator<MenuItem> itr = menu.listIterator();
    String itemDescription = "empty";
    while(itr.hasNext())  
    {
      if(itr.next().getItemNumber() ==  itemNumber)
      {
        itemDescription = itr.previous().toString();
        itr.next();
      }
    } 
    return itemDescription;
  } 
}