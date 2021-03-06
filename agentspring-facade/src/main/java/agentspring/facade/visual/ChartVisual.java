package agentspring.facade.visual;

import java.util.List;

import agentspring.facade.db.Source;
import agentspring.facade.db.Visual;

public class ChartVisual extends Visual {
    private static final long serialVersionUID = 1L;
    private String type;
    private String yaxis;

    public final static String clazz = "chart";

    public ChartVisual(Integer id, String title, String type, String yaxis) {
        super(id, title);
        this.type = type;
        this.yaxis = yaxis;
    }

    public ChartVisual(Integer id, String title, List<Source> sources, String type, String yaxis) {
        super(id, title, sources);
        this.type = type;
        this.yaxis = yaxis;
    }

    public ChartVisual(Integer id, String title, int[] sources, String type, String yaxis) {
        super(id, title, sources);
        this.type = type;
        this.yaxis = yaxis;
    }

    public String getType() {
        return this.type;
    }

    public String getYaxis() {
        return this.yaxis;
    }

    @Override
    public String getClazz() {
        return ChartVisual.clazz;
    }
}
