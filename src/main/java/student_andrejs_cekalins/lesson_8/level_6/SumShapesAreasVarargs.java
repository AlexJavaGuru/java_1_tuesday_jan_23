package student_andrejs_cekalins.lesson_8.level_6;


class SumShapesAreasVarargs {
    public double sumArea(String j, double...shapes) {
        double totalShapesArea = 0;
        for (double shape : shapes) {
            totalShapesArea +=shape;
        }
      return totalShapesArea;
    }

    public static void main(String[] args) {
        SumShapesAreasVarargs sumShapesAreaVarargs = new SumShapesAreasVarargs();
        System.out.println(sumShapesAreaVarargs.sumArea("Two shapes area sum is: ",23, 18));
        System.out.println(sumShapesAreaVarargs.sumArea("Four shapes area sum is: ",23, 15, 55.3, 531));
    }
}
