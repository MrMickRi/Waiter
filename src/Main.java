import java.util.Scanner;

import model.Dessert;
import model.Drink;
import model.MainCourse;
import model.MenuItem;

public class Main {

	Dessert[] dessertMenu;
	MainCourse[] mainCourseMenu;
	Drink[] drinkMenu;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	public Main() {
		createMenus();
		displayMenu(dessertMenu);
		displayMenu(drinkMenu);
		askingWaiter();
		
	}
	
	public void createMenus() {
		dessertMenu = new Dessert[4];
		dessertMenu[0] = new Dessert("Tiramisu", 6, false);
		dessertMenu[1] = new Dessert("Gelato", 6, false);
		dessertMenu[2] = new Dessert("Sorbete", 6, true);
		dessertMenu[3] = new Dessert("Bread and butter pudding", 6, false);
		
		mainCourseMenu = new MainCourse[4];
		mainCourseMenu[0] = new MainCourse("Pizza", 15);
		mainCourseMenu[1] = new MainCourse("Carbonara", 17);
		mainCourseMenu[2] = new MainCourse("Bolognese", 14);
		mainCourseMenu[3] = new MainCourse("Lasagne", 15);
		
		drinkMenu = new Drink[4];
		drinkMenu[0] = new Drink("Coke",3.5,false);
		drinkMenu[1] = new Drink("Orange",2,false);
		drinkMenu[2] = new Drink("Wine",9,true);
		drinkMenu[3] = new Drink("Whiskey",13,true);
		
	}
	public void displayMenu(MenuItem[] menu) {
		
		for(int i = 0;i < menu.length;i++) {
			System.out.println(menu[i]);
		}
		
	}
	public void askingWaiter() {
		System.out.println("1 - Main 2 - Desserts 3 - Drinks");
		int choice = scan.nextInt();
		if(choice==1) {
			displayMenu(mainCourseMenu);
		}
		else if(choice==2) {
			displayMenu(dessertMenu);
		}
		else if(choice==3) {
			displayMenu(drinkMenu);
		}else {System.out.println("Not a Valid Option");}
	}
	
	
}
