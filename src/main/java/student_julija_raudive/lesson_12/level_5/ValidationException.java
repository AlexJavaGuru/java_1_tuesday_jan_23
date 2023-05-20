package student_julija_raudive.lesson_12.level_5;

import java.util.Objects;

class ValidationException extends Exception {

     private String ruleName;
     private String description;
     String fieldName;

     public ValidationException(String ruleName, String description, String fieldName) {
         this.ruleName = ruleName;
         this.description = description;
         this.fieldName = fieldName;
     }


     public String getRuleName() {
         return ruleName;
     }

     public String getDescription() {
         return description;
     }

     public String getFieldName() {
         return fieldName;
     }

     @Override
     public String toString() {
         return "ValidationException{" +
                 "ruleName='" + ruleName + '\'' +
                 ", description='" + description + '\'' +
                 ", fieldName='" + fieldName + '\'' +
                 '}';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return ruleName.equals(that.ruleName) && description.equals(that.description) && fieldName.equals(that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }
}



