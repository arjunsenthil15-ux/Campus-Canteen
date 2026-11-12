import java.util.ArrayList;
public class CanteenApp {
    static ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    public static void main(String[] args) {
        OrderView view = new OrderView();
        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Idli", 20));
        menu.add(new MenuItem("Filter Coffee", 15));
        OrderController controller = new OrderController(menu, view);
        System.out.println("\nWelcome to Campus Canteen!");
        boolean running = true;
        while (running) {
            controller.showMenu();
            int choice = controller.readChoice();
            if (controller.isFinished(choice)) {
                controller.printReceipt();
                running = false;
            } else {
                controller.takeOrder(choice);
            }
        }
        System.out.println("\nThank you! Visit again.\n\n");
    }
    



    
}

    

