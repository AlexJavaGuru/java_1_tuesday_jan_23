package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.Objects;

class Orders {
    private long orderId;
    private String title;
    private Flow flow;
    private double volume;
    private double weight;

    public Orders(String title, Flow flow, double volume, double weight) {
        this.title = title;
        this.flow = flow;
        this.volume = volume;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", title='" + title + '\'' +
                ", flow=" + flow +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders orders)) return false;
        return Double.compare(orders.volume, volume) == 0 && Double.compare(orders.weight, weight) == 0 && title.equals(orders.title) && flow == orders.flow;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, flow, volume, weight);
    }
}
