public class DZ3 {
    public interface iShapeArea {
        double area();
    }

    public interface iShapeVolume {
        double volume();
    }

    public class Circle implements iShapeArea {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    public class Cube implements iShapeArea, iShapeVolume {
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}
