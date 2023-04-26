package student_oksana_tarasova.lesson_12.level_5;

import java.util.Objects;

public class ValidationException extends Exception {

    private String ruleName;
    private String fieldName;
    private String description;

    public ValidationException(String ruleName, String fieldName, String description) {
        this.ruleName = ruleName;
        this.fieldName = fieldName;
        this.description = description;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) && Objects.equals(fieldName, that.fieldName) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, fieldName, description);
    }

    @Override
    public String toString() {
        return "ValidationException{" +
                "ruleName='" + ruleName + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
