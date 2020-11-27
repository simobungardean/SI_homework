package homework_func;

public class SalesRepresentative {
    private final int sales;
    private final int quota;
    private final int worth;

    public SalesRepresentative(int sales, int quota) {
        super();
        this.sales = sales;
        this.quota = quota;
        this.worth = sales * quota;
    }

    public int getSales() {
        return sales;
    }

    public int getQuota() {
        return quota;
    }

    public int getWorth() {
        return worth;
    }
}
