package student_julija_raudive.lesson_9.level_7.task_25;

 class StringOperations {

     StrategyPatternExample example;

     public StringOperations(StrategyPatternExample example) {
         this.example = example;
     }

     public String changeString(String word){
         return example.stringOperation(word);
     }
 }
