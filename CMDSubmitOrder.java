package cosc436_assignment_4;

//author: Michael Leonard

public class CMDSubmitOrder implements CMDInterface 
{
  Aggregator aggregator;
  int orderNumber;
  
  public CMDSubmitOrder(Aggregator aggregator, int orderNumber)
  {
    this.aggregator = aggregator;
    this.orderNumber = orderNumber;
  }
  
  public String execute() 
  {
   aggregator.getOrders().add(new OrdersItem(orderNumber));
   return "Order has been placed";
  }
}