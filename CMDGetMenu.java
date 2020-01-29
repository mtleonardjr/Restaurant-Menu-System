package cosc436_assignment_4;

//author: Michael Leonard

public class CMDGetMenu implements CMDInterface 
{
  Aggregator aggregator;
  
  public CMDGetMenu(Aggregator aggregator)
  {
    this.aggregator = aggregator;
  }
  
  public String execute() 
  {
    aggregator.getMenu().displayMenu();
    return "--End of Menu--";
  }
}