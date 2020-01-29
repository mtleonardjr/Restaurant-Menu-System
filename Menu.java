package cosc436_assignment_4;
import java.util.ArrayList;
import java.util.ListIterator;

//author: Michael Leonard

public class Menu 
{
  private ArrayList<MenuItem> menu;
  
  //constructor
  public Menu()
  {
    menu = new ArrayList<MenuItem>(20);
    populateMenu();
  }
  
  //adds a menuitem object to the menu
  public void add(MenuItem item)
  {
    menu.add(item);
  }
  
  //getter
  public ArrayList<MenuItem> getMenu()
  {
    return menu;
  }
  
  //method to fill the menu
  public void populateMenu()
  {
    menu.add(new MenuItem(1,"Chicken",9.99));
    menu.add(new MenuItem(2,"Steak",10.99));
    menu.add(new MenuItem(3,"Pork",9.99));
    menu.add(new MenuItem(4,"Fish",11.99));
    menu.add(new MenuItem(5,"Soup",5.99));
    menu.add(new MenuItem(6,"Sushi",12.99));
  }
  
  //displays menu
  public String displayMenu()
  {
    ListIterator<MenuItem> itr = menu.listIterator(); 
    while(itr.hasNext())
    {
      System.out.println(itr.next().toString());
    }  
    return new String("The menu is displayed");
  }  
}