package w18comp1011s1mar22;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class BarGraphViewController implements Initializable
{
    @FXML private BarChart barChart;
    @FXML private CategoryAxis months;
    @FXML private NumberAxis effort;
          private XYChart.Series comp1011;
          private XYChart.Series comp2007;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //initialize the chart series
        comp1011 = new XYChart.Series<>();
        comp2007 = new XYChart.Series<>();
        
        //add labels 
        months.setLabel("Months");
        effort.setLabel("% of effort");
        
        //give names to the data series (so it will populate the legend)
        comp1011.setName("Adv Objects");
        comp2007.setName("COMP2007");
        
        //add data to be overwritten to set the months in order
        comp1011.getData().add(new XYChart.Data("January", 0));
        comp1011.getData().add(new XYChart.Data("February", 0));
        comp1011.getData().add(new XYChart.Data("March", 0));
        comp1011.getData().add(new XYChart.Data("April", 0));
        
        //add data to the series
        getDataForSeries();
        
        barChart.getData().addAll(comp1011);
        barChart.getData().addAll(comp2007);
        
     
        
     
    }    
    
    /**
     * This method will populate the XYChart.Series objects 
     */
    public void getDataForSeries()
    {
        comp1011.getData().add(new XYChart.Data("March", 50));
        comp1011.getData().add(new XYChart.Data("April", 100));
        comp1011.getData().add(new XYChart.Data("January", 20));
        comp1011.getData().add(new XYChart.Data("February", 80));
     
        
        comp2007.getData().add(new XYChart.Data("January", 10));
        comp2007.getData().add(new XYChart.Data("February", 20));
        comp2007.getData().add(new XYChart.Data("March", 30));
        comp2007.getData().add(new XYChart.Data("April", 40));
    }
    
    
}
