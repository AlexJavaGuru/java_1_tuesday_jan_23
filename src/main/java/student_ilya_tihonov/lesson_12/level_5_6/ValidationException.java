package student_ilya_tihonov.lesson_12.level_5_6;

public class ValidationException extends Exception{

    private String ruleName;
    private String description;
    private String fieldName;

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


}
