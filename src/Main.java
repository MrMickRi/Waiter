import model.Dessert;
import model.Drink;
import model.MainCourse;

public class Main {

	Dessert[] dessertMenu;
	MainCourse[] mainCourseMenu;
	Drink[] drinkMenu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	public Main() {
		
		
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
		
	}
	
}
