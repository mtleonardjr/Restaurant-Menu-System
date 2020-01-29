//SHOULD BE GOOD BUT COULD USE A MORE ELEGANT ITEM NUMBER SYSTEM
package cosc436_assignment_4;

//author: Michael Leonard

public class MenuItem 
{
  private int itemNumber;
  private String description;
  private double cost;
  
  //constructor
  public MenuItem(int itemNumber, String description, double cost)
  {
    this.itemNumber = itemNumber;
    this.description = description;
    this.cost = cost;
  }
  
  //getter for itemNumber
  public int getItemNumber()
  {
    return itemNumber;
  }
  
  //to string formatted for both the menu and for the tab displays
  public String toString()
  {
    return itemNumber + " " +description+ " $"+cost;
  }
}