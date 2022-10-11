package view;

import controller.Controller;
import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;

import java.util.List;

public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void execute() {
        Entity apple = new Apple("yellow");
        apple.setWeight(400);
        controller.add(apple);

        Entity cake = new Cake("vanilla");
        cake.setWeight(1800);
        controller.add(cake);

        Entity book = new Book(50, "ex1");
        book.setWeight(100);
        controller.add(book);

        Entity book2 = new Book(100, "ex2");
        book2.setWeight(1700);
        controller.add(book2);

        List<Entity> entities = controller.getAllWithWeightGreaterThan();

        for (Entity entity: entities) {
            System.out.println(entity);
        }
    }
}
