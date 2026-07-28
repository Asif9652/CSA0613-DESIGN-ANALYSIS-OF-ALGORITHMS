import java.util.ArrayList;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ConvexHull {

    static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);

        if (val == 0)
            return 0;

        return (val > 0) ? 1 : 2;
    }

    static void bruteForceHull(Point points[], int n) {

        ArrayList<Point> hull = new ArrayList<>();

        if (n < 3) {
            System.out.println("Convex Hull not possible");
            return;
        }

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int pos = 0, neg = 0;

                for (int k = 0; k < n; k++) {

                    if (k == i || k == j)
                        continue;

                    int val = (points[j].x - points[i].x) * (points[k].y - points[i].y)
                            - (points[j].y - points[i].y) * (points[k].x - points[i].x);

                    if (val > 0)
                        pos++;
                    else if (val < 0)
                        neg++;
                }

                if (pos == 0 || neg == 0) {

                    if (!hull.contains(points[i]))
                        hull.add(points[i]);

                    if (!hull.contains(points[j]))
                        hull.add(points[j]);
                }
            }
        }

        System.out.println("Convex Hull Points:");

        for (Point p : hull)
            System.out.println("(" + p.x + "," + p.y + ")");
    }

    public static void main(String[] args) {

        Point points[] = {
                new Point(0, 3),
                new Point(2, 2),
                new Point(1, 1),
                new Point(2, 1),
                new Point(3, 0),
                new Point(0, 0),
                new Point(3, 3)
        };

        bruteForceHull(points, points.length);
    }
}