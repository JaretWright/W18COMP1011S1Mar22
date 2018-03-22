package w18comp1011s1mar22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class LaunchBarGraph extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("BarGraphView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Wicked Graphs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
