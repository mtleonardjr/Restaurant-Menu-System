package cosc436_assignment_4;

//author: Michael Leonard

public class Aggregator 
{
  private Menu menu;
  private Orders orders;
  
  //constructor
  public Aggregator()
  {
    menu = new Menu();
    orders = new Orders();
  }
  
  //getters
  public Orders getOrders()
  {
    return orders;
  }
  public Menu getMenu()
  {
    return menu;
  }  
}