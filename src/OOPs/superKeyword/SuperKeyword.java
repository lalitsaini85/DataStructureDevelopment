package OOPs.superKeyword;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 2/2/2023
 * Time: 3:53 PM
 * File Name : SuperKeyword.java
 */
public class SuperKeyword {
    public static void main(String[] args) {
        Triange triange = new Triange(3, "Trianlge");
    }
}

class Polygon {
    int side;
    String name;

    public Polygon(int side, String name) {
        this.side = side;
        this.name = name;
    }

    void display() {
        System.out.println(name + " has " + side + " side");
    }

}

class Triange extends Polygon {
    public Triange(int side, String name) { // java automatically calls super() means parent class constructor implicitly.
        // if there are not noArgs constructor in the superclass then we can't use super() and java will not call it implicitly in that situation.
        super(side, name);  //super will be the first statement of the subclass constructor.

    }

    @Override
    void display() {      // we can't override a method which has greater access modifier in super class than subclass
        // means  private, default, protected cannot override public method.
        super.display();
    }
}

