import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableViewDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		TableView<Country> tableView = new TableView<>();
		ObservableList<Country> data =
				FXCollections.observableArrayList(
				new Country("USA", "Washington DC", 280, true),
				new Country("Canada", "Ottawa", 32, true),
				new Country("United Kingdom", "London", 60, true),
				new Country("Germany", "Berlin", 83, true),
				new Country("France", "Paris", 60, true));
		tableView.setItems(data);
		TableColumn<Country, String> countryColumn = new TableColumn<>("Country");
		countryColumn.setMinWidth(100);
		countryColumn.setCellValueFactory(
				new PropertyValueFactory<Country, String>("country"));
		TableColumn<Country, String> capitalColumn = new TableColumn<>("Capital");
		capitalColumn.setMinWidth(100); capitalColumn.setCellValueFactory(
				new PropertyValueFactory<Country, String>("capital"));
		TableColumn<Country, Double> populationColumn = new TableColumn<>("Population (million)");
		populationColumn.setMinWidth(200); populationColumn.setCellValueFactory(
				new PropertyValueFactory<Country, Double>("population"));
		TableColumn<Country, Boolean> democraticColumn = new TableColumn<>("Is Democratic?");
		democraticColumn.setMinWidth(200); democraticColumn.setCellValueFactory(
				new PropertyValueFactory<Country, Boolean>("democratic"));
		tableView.getColumns().addAll(countryColumn, capitalColumn, populationColumn, democraticColumn);
		Pane pane = new Pane();
		pane.getChildren().add(tableView);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("TableViewDemo"); // Set the window title 
		primaryStage.setScene(scene); // Place the scene in the window
		primaryStage.show(); // Display the window
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public static class Country {
		private final SimpleStringProperty country;
		private final SimpleStringProperty capital;
		private SimpleDoubleProperty population;
		private SimpleBooleanProperty democratic;
		
		private Country(String country, String capital, double population, boolean democratic) {
			this.country = new SimpleStringProperty(country);
			this.capital = new SimpleStringProperty(capital);
			this.population = new SimpleDoubleProperty(population);
			this.democratic = new SimpleBooleanProperty(democratic);
		}
		public String getCountry() {
			return this.country.get();
		}
		
		public void setCountry(String country) {
			this.country.set(country);
		}
		
		public String getCapital() {
			return this.capital.get();
		}
		
		public void setCapital(String capital) {
			this.capital.set(capital);
		}
		
		public double getPopulation() {
			return population.get();
		}
		
		public boolean isDemocratic() {
			return this.democratic.get();
		}
		
		public void setDemocratic(boolean democratic) {
			this.democratic.set(democratic);
		}
		
		
	}

}
