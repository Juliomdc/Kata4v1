
package kata4v1;

public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histo;

    public HistogramDisplay(Histogram<String> histo) {
        this.histo = histo;
        setContentPane(CreatePanel());
        pack;
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(create));
        chartPanel.SetPreferredSize(new Dimension(500,450));
        return chartPanel;
    }
    
    private JFree Chart createChart(){
        JFreeChart chart = ChartFactory.createBarChart
    }
    
}
