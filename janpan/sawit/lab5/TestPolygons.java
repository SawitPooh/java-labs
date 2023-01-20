package janpan.sawit.lab5;

/*
 * This Program TestPolygons is about 2 types of polygon and take that to find summation area.
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */

enum PolygonType {
    //define type of polygon the first is rectangle and the second is triangle
    RECTANGLE,
    TRIANGLE
}

class Polygon {
    double width;
    double height;
    PolygonType type;
    static int numPolygons;
    static double sumPolygonsArea;

    double getArea() {
        /*
         * This method will change type based on input. 
         * if it's rectangle will summation area of rectangle.
         * if it's triangle will summation area of triangle.
         * and after will return summation area.
         */
        switch (type) {
            case RECTANGLE:
                sumPolygonsArea = width * height;
            case TRIANGLE:
                sumPolygonsArea = 0.5 * width * height;
        }
        return sumPolygonsArea;
    }

    static void setNumPolygons(int numNewPolygons) {
        //This method will set parameter input to plus with numPolygons attribute  and this will be current value.
        numPolygons += numNewPolygons;
    }

    static void setSumPolygonsArea(double newPolygonsArea) {
        //This method will set parameter input to plus with sumPolygonsArea attribute and this will be current value.
        sumPolygonsArea += newPolygonsArea;
    }
}

public class TestPolygons {
    //This main class to call any method after will output on screen;
    public static void main(String[] agrs) {
        Polygon polygon1 = new Polygon();
        polygon1.width = 2;
        polygon1.height = 3;
        polygon1.type = PolygonType.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.height = 4;
        polygon2.type = PolygonType.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        System.out.println("The number of polygons is " + Polygon.numPolygons + " or " + polygon1.numPolygons + " or " + polygon2.numPolygons);
        //this yellow sign it's should be accessed in a static way but this code use object .
        System.out.println("The width of polygon1 is " + polygon1.width + " the width of polygon2 is " + polygon2.width);
        System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }
}
