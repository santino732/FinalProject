package SalterSmoother;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

//https://www.codejava.net/java-se/graphics/using-jfreechart-to-draw-xy-line-chart-with-xydataset
//
	
	public class Function_plotter extends JFrame {
		 
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Function_plotter() {
	        super("Plotter Class");
	 
	        JPanel chartPanel = createChartPanel();
	        add(chartPanel, BorderLayout.CENTER);
	 
	        setSize(640, 480);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	    }
	 
		private JPanel createChartPanel() {
		    String chartTitle = "Function Plotter";
		    String xAxisLabel = "X - Value";
		    String yAxisLabel = "Y - Value";
		 
		    XYDataset dataset = createDataset();
		 
		    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
		            xAxisLabel, yAxisLabel, dataset);
		 
		    return new ChartPanel(chart);
		}

	 
	    private XYDataset createDataset() {
		    XYSeriesCollection dataset = new XYSeriesCollection();
		    XYSeries series1 = new XYSeries("Y = MX + B");
		    Random rand = new Random();
		    
		    double x = 1.0;
		    double m = 2.0;
		    double b = 3.0;
		    
		    for (int j = 0; j<50; j++)   //for loop that populates x values and y values.
			{
		    	//y = 2x+3
		   
			    double y = m*x+b;
			    series1.add(x,y);
			    x++;
			}
		    dataset.addSeries(series1);
		 
		    return dataset;
		}
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Function_plotter().setVisible(true);
	            }
	        });
	    }
	}