package student_aleksandrs_lezhennikovs.lesson_12.level_5;

class ValidationException extends Exception {

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
}
