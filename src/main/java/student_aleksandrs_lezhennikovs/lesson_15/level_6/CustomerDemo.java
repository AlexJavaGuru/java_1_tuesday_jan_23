package student_aleksandrs_lezhennikovs.lesson_15.level_6;

import student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore.Categories;
import student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore.Customer;
import student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore.Movie;
import student_aleksandrs_lezhennikovs.lesson_15.level_6.videostore.Rental;

class CustomerDemo {
    public static void main(String[] args) {
        Customer customerAlex = new Customer("Alex");
        Customer customerDima = new Customer("Dima");
        Customer customerOlga = new Customer("Olga");

        Movie spiderman = new Movie("Spiderman", Categories.NEW_RELEASE);
        Movie spiderman2 = new Movie("Spiderman2", Categories.NEW_RELEASE);
        Movie bamby = new Movie("Bamby", Categories.CHILDRENS);
        Movie angelika = new Movie("Angelika", Categories.REGULAR);

        //Rental rental1 = new Rental(spiderman, 1);
        //Rental rental2 = new Rental(bamby, 10);
        //Rental rental3 = new Rental(angelika, 10);
        //Rental rental4 = new Rental(spiderman2, 1);

        customerAlex.addRental(new Rental(angelika, 3));
        customerAlex.addRental(new Rental(spiderman2, 1));
        customerDima.addRental(new Rental(bamby, 10));
        customerOlga.addRental(new Rental(angelika, 10));

        System.out.println(customerAlex.statement());
        //System.out.println(customerDima.statement());
        //System.out.println(customerOlga.statement());
    }
}
