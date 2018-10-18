import Controller.Controller;
import Repository.IRepo;
import Repository.Repository;
import View.UI;

public class Main {

    public static void main(String[] args) {
        IRepo repo = new Repository();
        Controller controller = new Controller(repo);
        UI ui = new UI(controller);
        ui.filterCommand();
    }
}
