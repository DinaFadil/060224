package lesson9.DrawingProgram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

class DrawingPanel extends JPanel {
    private List<Shape> shapes = new ArrayList<>(); // Initialize an array to stores all shapes that being made during
                                                    // drawing process
    private List<Point> freeformPoints = new ArrayList<>(); // Initialize an array to stores value of each point the
                                                            // mouse move for drawing process

    // Due to DrawingPanel is extend of JPanel, therefore it is essentially a type
    // of "JPanel"
    public DrawingPanel() {
        setPreferredSize(new Dimension(1000, 1000)); // Set the dimension of drawing canvas
        setBackground(Color.white); // Set background of drawing canvas
    }

    public void drawShape(Point startPoint, Point endPoint, ShapeType shapeType) {
        Shape shape = null; // Initialize shape that will store the data of the shape that will be drawn
        switch (shapeType) {
            case LINE:
                shape = new Line2D.Double(startPoint, endPoint); // Initialize the shape of line
                break;
            case RECTANGLE:
                shape = new Rectangle2D.Double( // Initialize the shape of rectangle
                        Math.min(startPoint.getX(), endPoint.getX()), // Taking the minimum value of x coordinates
                        Math.min(startPoint.getY(), endPoint.getY()), // Taking the minimum value of y coordinates, this
                                                                      // due to Cartesian coordinate system where y-axis
                                                                      // increases from top to bottom
                        Math.abs(endPoint.getX() - startPoint.getX()), // width of rectangle
                        Math.abs(endPoint.getY() - startPoint.getY())); // height of rectangle
                break;
            case CIRCLE:
                double radius = Math.sqrt( // Initialize the radius of circle
                        Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                                Math.pow(endPoint.getY() - startPoint.getY(), 2));
                shape = new Ellipse2D.Double( // Initialize the shape of circle
                        startPoint.getX() - radius, // Taking the x coordinate of middle point
                        startPoint.getY() - radius, // Taking the y coordinate of middle point
                        2 * radius, // width of eclipse
                        2 * radius); // height of eclipse
                break;
            default:
                break;
        }
        if (shape != null) {
            shapes.add(shape); // Store the drawn shape into the array
        }
    }

    public void startFreeformDrawing(Point startPoint) {
        freeformPoints.clear(); // Clear the data inside freeformPoints array
        freeformPoints.add(startPoint); // store first point of freeformPoints array
    }

    public void continueFreeformDrawing(Point currentPoint) {
        freeformPoints.add(currentPoint); // Storing every point of the mouse move to freeformPoints array
        repaint();
    }

    public void stopFreeformDrawing() {
        if (!freeformPoints.isEmpty()) { // Checking if the freeformPoints array is empty or not
            shapes.add(createFreeformShape()); // add the shape of freeForm to the shapes array
            freeformPoints.clear(); // Clear all the data of freeformPoints array
            repaint();
        }
    }

    private Shape createFreeformShape() {
        GeneralPath path = new GeneralPath(); // GeneralPath is a class in Java's 2D graphics API (java.awt.geom) that
                                              // represents a geometric path constructed from straight lines, curves,
                                              // and other path segments.
        path.moveTo(freeformPoints.get(0).getX(), freeformPoints.get(0).getY()); // moveTo(x, y) moves the "pen" to the
                                                                                 // specified starting point without
                                                                                 // drawing a line.
        for (Point point : freeformPoints) {
            path.lineTo(point.getX(), point.getY()); // lineTo(x, y) adds a straight line segment from the current
                                                     // position to the specified endpoint.
        }
        return path;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // he Graphics2D class is a subclass of Graphics and extends its functionality.
                                         // It provides additional methods and capabilities for more advanced graphics
                                         // operations, such as transformations, composite rendering, and more.
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        for (Shape shape : shapes) {
            g2d.draw(shape); // Draw every shape inside the array
        }
    }
}
