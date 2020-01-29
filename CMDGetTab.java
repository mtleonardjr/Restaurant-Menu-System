package cosc436_assignment_4;

//author: Michael Leonard

public class CMDGetTab implements CMDInterface 
{
  Aggregator aggregator;
  
  public CMDGetTab(Aggregator aggregator)
  {
    this.aggregator = aggregator;
  }
  
  public String execute() 
  {
    Tab tab = new Tab(aggregator.getOrders());
    tab.displayTab();
    return "--End of Tab--";
  }
}