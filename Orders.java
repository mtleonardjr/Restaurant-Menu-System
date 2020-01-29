package cosc436_assignment_4;
import java.util.ArrayList;
import java.util.ListIterator;

//author: Michael Leonard

public class Orders 
{
  private ArrayList<OrdersItem> orders;
  
  //constructor
  public Orders()
  {
    orders = new ArrayList<OrdersItem>(20);
  }
  
  //adds a ordersitem object to the order
  public void add(OrdersItem item)
  {
    orders.add(item);
  }
  
  //returns the orders ArrayList
  public ArrayList<OrdersItem> getTab()
  {
    return orders;
  }
}