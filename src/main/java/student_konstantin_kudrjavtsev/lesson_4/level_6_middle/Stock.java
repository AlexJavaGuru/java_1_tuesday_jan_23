package student_konstantin_kudrjavtsev.lesson_4.level_6_middle;

class Stock {

    String company;
    int regularPrice;
    int minimumCost;
    int maximumCost;

    Stock(String company, int regularPrice) {
        this.company = company;
        this.regularPrice = regularPrice;
        this.minimumCost = regularPrice;
        this.maximumCost = regularPrice;
    }

    public void updatePrice(int newPrice) {
        regularPrice = newPrice;
        if (newPrice > maximumCost) {
            maximumCost = newPrice;
        } else if (newPrice < minimumCost) {
            minimumCost = newPrice;
        }
    }

    public void getPriceInformation() {
        System.out.println("Company" + company);
        System.out.println("Regular price" + regularPrice );
        System.out.println("Maximum cost" + maximumCost);
        System.out.println("Mininum cost" + minimumCost);
    }

    public String getCompany() {
        return this.company;
    }

    public int getRegularPrice() {
        return this.regularPrice;
    }

    public double getMinimumCost() {
        return this.minimumCost;
    }

    public double getMaximumCost() {
        return this.maximumCost;
    }
}