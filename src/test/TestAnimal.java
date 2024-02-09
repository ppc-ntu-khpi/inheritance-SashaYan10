package test;

import domain.Snake;

public class TestAnimal {

    public static void main(String[] args) {
        Snake snake = new Snake();
        System.out.println(snake);
        snake.sound();
        snake.move();
        snake.hunt();
        snake.eat();
        snake.eggLaying();
        snake.sleep();
    }
}
