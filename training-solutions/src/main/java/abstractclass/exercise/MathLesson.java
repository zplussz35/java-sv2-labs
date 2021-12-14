package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise add = new Adder();
        MathExercise subtract = new Subtracter();
        MathExercise mult = new Multiplier();
        MathExercise div= new Divisor();
        System.out.println(add.getSolution(10,20));
        System.out.println(subtract.getSolution(10,20));
        System.out.println(mult.getSolution(10,20));
        System.out.println(div.getSolution(10,20));
    }
}
