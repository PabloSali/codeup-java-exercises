package shapes;

public class Square extends Quadrilateral {
    public Square(long length, long width) {
        super(length, width);
    }

    @Override
    public void setlength(long length) {
        super.length = length;
    }

    @Override
    public void setWidth(long width) {
        super.width = width;
    }

    @Override
    public long getArea() {
        return 0;
    }

    @Override
    public long getPerimeter() {
        return 0;
    }
}
