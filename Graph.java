package Program;

import java.io.*;
import org.apache.commons.*;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph {

   public static void main( String[ ] args ) throws Exception {
      DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
      JFreeChart lineChartObject = ChartFactory.createLineChart(
         "Salter","X","Y",
         line_chart_dataset,PlotOrientation.VERTICAL,
         true,true,false);

      int width = 640;    /* Width of the image */
      int height = 480;   /* Height of the image */ 
      File lineChart = new File( "LineChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);
   }
}

