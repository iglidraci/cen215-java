package view;

import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.util.converter.DoubleStringConverter;
import model.Country;


public class CountryView extends BorderPane {
    private final TableView<Country> tableView = new TableView<>();
    private final TableColumn<Country, String> countryColumn;
    private final TableColumn<Country, String> capitalColumn;
    private final TableColumn<Country, Double> populationColumn;
    private final TableColumn<Country, Boolean> democraticColumn;

    public TableColumn<Country, String> getCountryColumn() {
        return countryColumn;
    }

    public TableColumn<Country, String> getCapitalColumn() {
        return capitalColumn;
    }

    public TableColumn<Country, Double> getPopulationColumn() {
        return populationColumn;
    }

    public TableColumn<Country, Boolean> getDemocraticColumn() {
        return democraticColumn;
    }

    private final TextField tfCountry = new TextField();
    private final TextField tfCapital = new TextField();
    private final TextField tfPopulation = new TextField();
    private final CheckBox chkIsDemocratic = new CheckBox("Is democratic?");
    private final Button btnAdd = new Button("Add");
    private final Button btnDelete = new Button("Delete");
    private final Button btnPrint = new Button("Print");

    public Button getBtnPrint() {
        return btnPrint;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public CountryView() {
        tableView.setEditable(true);
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        countryColumn = new TableColumn<>("Country");
        countryColumn.setMinWidth(100);
        countryColumn.setCellValueFactory(new PropertyValueFactory<Country, String>("country"));
        countryColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        capitalColumn = new TableColumn<>("Capital");
        capitalColumn.setMinWidth(100);
        capitalColumn.setCellValueFactory(new PropertyValueFactory<Country, String>("capital"));
        capitalColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        populationColumn = new TableColumn<>("Population");
        populationColumn.setMinWidth(100);
        populationColumn.setCellValueFactory(new PropertyValueFactory<Country, Double>("population"));
        populationColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));

        democraticColumn = new TableColumn<>("Is Democratic?");
        democraticColumn.setMinWidth(100);
        democraticColumn.setCellValueFactory(new PropertyValueFactory<Country, Boolean>("democratic"));
        democraticColumn.setCellFactory(ComboBoxTableCell.forTableColumn(true, false));

        tableView.getColumns().addAll(countryColumn, capitalColumn, populationColumn, democraticColumn);

        FlowPane flowPane = new FlowPane(3, 3);
        tfCountry.setPrefColumnCount(5);
        tfCapital.setPrefColumnCount(5);
        tfPopulation.setPrefColumnCount(5);
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.getChildren().addAll(btnAdd, btnDelete, btnPrint);
        flowPane.getChildren().addAll(new Label("Country"), tfCountry,
                new Label("Capital"), tfCapital,
                new Label("Population"), tfPopulation,
                chkIsDemocratic, hBox);

        this.setCenter(tableView);
        this.setBottom(flowPane);
    }

    public TableView<Country> getTableView() {
        return tableView;
    }

    public TextField getTfCountry() {
        return tfCountry;
    }

    public TextField getTfCapital() {
        return tfCapital;
    }

    public TextField getTfPopulation() {
        return tfPopulation;
    }

    public CheckBox getChkIsDemocratic() {
        return chkIsDemocratic;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }
}
