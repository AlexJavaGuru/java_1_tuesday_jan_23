package student_anastasiia_bokareva.lesson3.level7;

public class Bottle {
    String name;
    Integer ml;
    Boolean isEmpty;
    Bottle (String name, int ml, boolean isEmpty){
        this.name=name;
        this.ml=ml;
        this.isEmpty = isEmpty;
    }
    public void fallDown(){
      if (isEmpty == true){
     System.out.println("bam-bam-mmm");}
  else {
System.out.println("buuuuummmmm");}
}
    public void open(){System.out.println("psssssss");}
}
