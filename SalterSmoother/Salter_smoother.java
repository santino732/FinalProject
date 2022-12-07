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
	
	import org.apache.*;

	//https://www.codejava.net/java-se/graphics/using-jfreechart-to-draw-xy-line-chart-with-xydataset
	//
		
		public class Salter_smoother extends JFrame {
			 
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Salter_smoother() {
		        super("XY Line Chart Example with JFreechart");
		 
		        JPanel chartPanel = createChartPanel();
		        add(chartPanel, BorderLayout.CENTER);
		 
		        setSize(640, 480);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setLocationRelativeTo(null);
		    }
		 
			private JPanel createChartPanel() {
			    String chartTitle = "Objects Movement Chart";
			    String xAxisLabel = "X";
			    String yAxisLabel = "Y";
			 
			    XYDataset dataset = createDataset();
			 
			    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
			            xAxisLabel, yAxisLabel, dataset);
			 
			    return new ChartPanel(chart);
			}

		 
		    private XYDataset createDataset() {
			    XYSeriesCollection dataset = new XYSeriesCollection();
			    XYSeries series1 = new XYSeries("Object 1");
			    
			   /*
			    * AREA TO IMPLEMENT CODE AND SALT DATA ACCORDINGLY 
			    * 
			    * after graphing salted version of data need to take mean
			    * of values and smooth data using apache library
			    * 
			    * 
			    */
			 
			    return dataset;
			}
		    
		    public static void main(String[] args) {
		        SwingUtilities.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		                new Salter_smoother().setVisible(true);
		            }
		        });
		    }
		}
