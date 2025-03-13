package com.kenfogel.javafx_01_basicexample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Basic JavaFX program created all in code
 *
 * @author Ken
 */
public class MainApp extends Application {

    /**
     * Start the JavaFX application
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {

        // Set window's title
        primaryStage.setTitle("Hello World!");

        Parent root = createLayout();
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        // Event when the window is closed by an external event such as by
        // clicking on Window exit decoration (the X in the title bar).
        // A Platform.exit() is implied but other tasks to carry out on exit
        // can be called here
        primaryStage.setOnCloseRequest(event -> {
            System.out.println("Bye for now.");
        });
    }

    /**
     * Create the layout of the UI
     *
     * @return the root pane
     */
    private StackPane createLayout() {

        StackPane root = new StackPane();
        // Create a button
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> System.out.println("Hello World!"));
        // Control added to StackPane is centered in the pane
        root.getChildren().add(btn);
        root.setStyle("-fx-font: 24 arial;");

        return root;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
