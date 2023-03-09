package student_konstantin_kudrjavtsev.lesson_4.level_6_middle;


class StockTest {

    public static void main(String[] args) {
        testMaximumCostIsEquelToInitialPriceTest();
        testMaximumCostIsEquelToInitialPriceAfterUpdateOnLowerPriceTest();
        testMaximumCostIsEquelToInitialPriceUpdatedPriceTest();
        testMaximumCostIsEquelToInitialPriceTest4();
        testMaximumCostIsEquelToInitialPriceTest5();
    }

        private static void testMaximumCostIsEquelToInitialPriceTest() {
        Stock stock = new Stock("Apple", 999);
        int regularMaximumCost = (int) stock.getMaximumCost();
        int expectedMaximumCost = 999;
        check(expectedMaximumCost, regularMaximumCost, "Maximum cost is equel to initial price");
    }

    private static void testMaximumCostIsEquelToInitialPriceAfterUpdateOnLowerPriceTest() {
        Stock stock = new Stock("Apple", 999);
        stock.updatePrice(1);
        int regularMaximumCost = (int) stock.getMaximumCost();
        int expectedMaximumCost = 999;
        check(expectedMaximumCost, regularMaximumCost, "Maximum cost is equel to initial price after update on lower price");
    }

    private static void testMaximumCostIsEquelToInitialPriceUpdatedPriceTest() {
        Stock stock = new Stock("Apple", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int regularMaximumCost = (int) stock.getMaximumCost();
        int expectedMaximumCost = 1000;
        check(expectedMaximumCost, regularMaximumCost, "Maximum cost is equel to initial price after update 2 to 1000");
    }

    private static void testMaximumCostIsEquelToInitialPriceTest4() {
        Stock stock = new Stock("Apple", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int regularMaximumCost = (int) stock.getMaximumCost();
        int expectedMaximumCost = 1000;
        check(expectedMaximumCost, regularMaximumCost, "");
    }

    private static void testMaximumCostIsEquelToInitialPriceTest5() {
        Stock stock = new Stock("Apple", 9);
        stock.updatePrice(27);
        int regularMaximumCost = (int) stock.getMaximumCost();
        int expectedMaximumCost = 27;
        check(expectedMaximumCost, regularMaximumCost, "");
    }

    private static void check( int expectedMaximumCost, int regularPrice, String testName){
            if (regularPrice == expectedMaximumCost) {
                System.out.println("Apple " + testName + ": Test has passed");
            } else {
                System.out.println("Apple " + testName + ": Test failed");
                System.out.println("Expected: " + expectedMaximumCost + ",but actual: " + regularPrice);
            }
        }
    }


