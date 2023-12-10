import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ShowOctagon extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new MyPolygon(), 400, 400);
        stage.setScene(scene);
        stage.setTitle("Octagon");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class MyPolygon extends Pane {
    private void paint() {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.BLUE);
        polygon.setStroke(Color.BLACK);
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = Math.min(getHeight(), getWidth()) * 0.4;
        for (int i = 0; i < 8; i++) {
            polygon.getPoints().add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            polygon.getPoints().add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }
        this.getChildren().clear();
        Circle circle = new Circle(centerX, centerY, radius);
        this.getChildren().add(circle);
        this.getChildren().add(polygon);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}
