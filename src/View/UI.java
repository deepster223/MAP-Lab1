package View;

import Controller.Controller;

import java.util.Scanner;

public class UI {
    private Controller controller;
    private Scanner scanner = new Scanner(System.in);

    public UI(Controller controller) {
        this.controller = controller;
    }

    public void filterCommand() {
        System.out.println("Enter filter parameter: ");
        int age = scanner.nextInt();
        System.out.println(controller.filter(age));
    }
}
