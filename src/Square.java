public class Square implements Shape
{

    private float side;

    public Square(float side)
    {
        this.side = side;
    }

    @Override
    public double area()
    {
        return side*side;
    }

    @Override
    public double perimeter()
    {
        return 4*side;
    }

    public float getSide()
    {
        return side;
    }
}
