public class Box {
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean equals(Object another) {
        if (!(another instanceof Box)) {
            return false;
        }
        // private means objects of the same class can access each other attributes directly
        Box obj = (Box) another;

        return (length == obj.length && height == obj.height && breadth == obj.breadth);
    }

    public Object clone() {
        return new Box(length, breadth, height);
    }

    public String toString() {
        return "Box(height=" + height + ",breadth=" + breadth + ",length=" + length + ")";
    }
}
