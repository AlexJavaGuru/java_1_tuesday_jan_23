package student_andrejs_cekalins.lesson_12.level_5_6;

import java.util.Objects;

public class ValidationException extends Exception {
    private String ruleName;
    private String description;
    private String fieldName;

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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ValidationException validationException = (ValidationException) o;
        return Objects.equals(ruleName, validationException.ruleName) &&
                Objects.equals(description, validationException.description) &&
                Objects.equals(fieldName, validationException.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

    @Override
    public String toString() {
        return "Product{" +
                ", ruleName ='" + ruleName + '\'' +
                ", description ='" + description + '\'' +
                ", fieldName =" + fieldName +
                '}';
    }
}
