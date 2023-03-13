package student_oksana_maksimova.lesson_3.level_7;

class Product {

        String name;
        double regularPrice;
        double discount;

        protected Product(String name, double regularPrice, double discount) {
            this.name = name;
            this.regularPrice = regularPrice;
            this.discount = discount;
        }

        double actualPrice() {
            double disc = regularPrice * discount / 100;
            double actPr = regularPrice - disc;
            return actPr;
        }

        void printInformation() {

            System.out.println("Product " + name + " regular price: " + regularPrice + "eur");
            System.out.println("discount  -" + discount + "%");
            System.out.println("Actual price - " + actualPrice() + " eur");


        }
    }
