import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestShape
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes =new ArrayList<>();

        Shape rectangle = new Rectangle(5,8);
        Shape triangle = new Triangle(3,4,5);
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(square);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        for (Shape shape:shapes)
        {
            System.out.println(shape.getClass().getSimpleName() + " area: " + df.format(shape.area()));
            System.out.println(shape.getClass().getSimpleName() + " perimeter " + df.format(shape.perimeter()) + "\n");
        }
    }
}
