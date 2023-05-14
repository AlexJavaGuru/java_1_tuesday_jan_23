package student_anastasiia_bokareva.lesson12.level5;

import java.util.Objects;

public class ValidationException extends Exception {

    private String ruleName;
    private String description;
    private String fieldName;

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
        return Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

    ValidationException(String rule, String description, String field) {
        this.ruleName = rule;
        this.description = description;
        this.fieldName = field;

    }


}
