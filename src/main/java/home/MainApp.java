package home;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application
{
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("GURPSApp");

        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/HomeView.fxml"));

        try
        {
            final AnchorPane mainPane = (AnchorPane) loader.load();
            final Scene scene = new Scene(mainPane);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (final IOException ex)
        {
            ex.printStackTrace();
        }

    }

    public Stage getPrimaryStage()
    {
        return primaryStage;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
