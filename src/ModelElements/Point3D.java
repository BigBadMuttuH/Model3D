    package ModelElements;

    public class Point3D {
        double x;
        double y;
        double z;

        public Point3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return this.x + ";" + this.x + ";" + this.z;
        }
    }
