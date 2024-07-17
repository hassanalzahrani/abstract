//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        ///////////////book class test=============


        Book b=new Book(30.5,"Harry potter","j.k.rowling");

        System.out.println("The name of the book is :" +  b.getName());
        System.out.println( "The name of the auther is :" + b.getAuthor());
        System.out.println( "the price of the book is :"+ b.getPrice());
        System.out.println( + b.getPrice() - b.getDiscount()+ " this the price after discount");

        System.out.println("===================================================================");



        //////////////////////////////////Movie class test============

        Movie m=new Movie(25.0,"Oppenheimer","christopher nolan");
        System.out.println("The name of the movie is :"+m.getName());
        System.out.println( "The name of the book is :" +m.getDirector());
        System.out.println(  "The name of the book is :"+ m.getPrice());
        System.out.println(m.getPrice()-m.getDiscount()+ " this the price after discount");

        System.out.println("===================================");
        System.out.println("===================================");






//////////////////////////////MoveablePoint test================================



        MovablePoint point = new MovablePoint(10, 20, 2, 3);

        System.out.println("Initial position: (" + point.getX() + ", " + point.getY() + ")");


        point.movedown();
        point.moveRight();


        System.out.println("New position: (" + point.getX() + ", " + point.getY() + ")");
    }
}








