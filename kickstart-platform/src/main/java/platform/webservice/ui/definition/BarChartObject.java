package platform.webservice.ui.definition;

public class BarChartObject {
    Double value;
    String point;

    public BarChartObject(String point,Double value) {
        this.value = value;
        this.point = point;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
}
