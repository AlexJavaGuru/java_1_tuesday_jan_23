package student_oksana_tarasova.lesson_8.level_7;

import java.util.ArrayList;

abstract class Library {
    String libraryName;
    String libraryDepartment;
}

class ProcurementDepartment extends Library {
    double bookCodeDepartment;
    int bookInventoryNumber;
    String bookTitle;
    int yearOfPublishing;
    double theCostOfTheBook;
    // private scienceClassifier scienceClassifier;
/*
      void findABook();
      ArrayList receiptOfTheBook();
      ArrayList writingOfTheBook();
 */
}

class LibraryDepartment extends Library {
    int userRegistrationNumber;
    long userID;
    String name;
    String surname;
    String userEmailAddress;
    long userPhoneNumber;

    void takeABook() {
    }

    void returnABook() {
    }

    void reservationBook() {
    }
}

class subscription extends LibraryDepartment {

    /*
    startDate;
    endDate;
    */

    void takeABook() {
    }

    void returnABook() {
    }

    void reservationBook() {
    }

    void chargeOfAFine() {
    }
}

class readingRoom extends LibraryDepartment {

    void takeABook() {
    }

    void returnABook() {
    }

    void reservationBook() {
    }
}

/*
enum scienceClassifier {
    GeneralScientificAndInterdisciplinaryKnowledge;
    NaturalSciences;
    TechniqueAndTechnicalScience;
    Agriculture;
    ForestryAndAgriculturalAndForestrySciences;
    HealthcareAndMedicalSciences;
    SocialAndHumanSciences;
    LiteratureOfUniversalContent;
Это библиотечный классификатор, по этим отралям наук книги зачисляются в фонд
}

 */
