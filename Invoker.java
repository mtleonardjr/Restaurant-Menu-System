package cosc436_assignment_4;

//author: Michael Leonard

public class Invoker 
{
  Aggregator aggregator;
  
  //Constructor
  public Invoker(Aggregator aggregator)
  {
    this.aggregator = aggregator;
  }
  
  //method to invoke display menu command
  public String getMenu()
  {
    return new CMDGetMenu(aggregator).execute();
  }
  
  //method to invoke submit an order command
  public String submitOrder(int orderNumber)
  {
    return new CMDSubmitOrder(aggregator, orderNumber).execute();
  }
  
  //Method to invoke get tab command
  public String getTab()
  {
    return new CMDGetTab(aggregator).execute();
  }
  
}