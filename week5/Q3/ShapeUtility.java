import java.util.*;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList == null || shapeList.isEmpty()) {
            return null;
        }

        Shape largest = null;
        for (Shape s : shapeList) {
            if (s instanceof Octagon) {
                if (largest == null || s.getArea() > largest.getArea()) {
                    largest = s;
                }
            }
        }
        return (Octagon) largest;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapelist) {
        ArrayList<Shape> nonRectangles = new ArrayList<>();

        if (shapelist == null) {
            return nonRectangles;
        }

        for (Shape shapes : shapelist) {
            if (!(shapes instanceof Rectangle)) {
                nonRectangles.add(shapes);
            }
        }

        return nonRectangles;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        ArrayList<Square> squaresMinArea = new ArrayList<>();

        if (shapeList == null || shapeList.isEmpty()) {
            return squaresMinArea;
        }

        for (Shape shape : shapeList) {
            if (shape instanceof Square && shape.getArea() >= minArea) {
                squaresMinArea.add((Square) shape);
            }
        }

        return squaresMinArea;
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {
        ArrayList<Shape> rectMinLength = new ArrayList<>();

        if (shapeList == null) {
            return rectMinLength;
        }

        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                if (rectangle.getLength() >= length) {
                    rectMinLength.add(rectangle);
                }
            }
        }

        return rectMinLength;
    }
}
