package student_oksana_tarasova.lesson_3.level_5;

 class OtherDog {

    String color;

    public OtherDog(String color){
        this.color = color;
    }

    public void voice(){
        System.out.println("Wow..wow!");
    }
    public void color(){
        System.out.println(color + " wool");
    }
    public void recoloring(String recolor){
       this.color = recolor;
       System.out.print(color + " wool");

    }
}
