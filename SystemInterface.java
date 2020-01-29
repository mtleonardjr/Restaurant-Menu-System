package cosc436_assignment_4;

//author: Michael Leonard

public class SystemInterface 
{
  public static Invoker invoker;
  
  //setter method
  public static void setInvoker(Invoker inv)
  {
    invoker = inv;
  } 
  
  //Display menu call
  public static String getMenu()
  {
    return invoker.getMenu();
  }
  
  //submit order call
  public static String submitOrder(int orderNumber)
  {
    return invoker.submitOrder(orderNumber);
  }
  
  //display order call
  public static String getTab()
  {
    return invoker.getTab();
  }
}