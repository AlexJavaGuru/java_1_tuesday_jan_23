package student_andrejs_cekalins.lesson_3.level_7.task_29;

class VacuumCleanerDemo {
    public static void main(String[] args) {
        VacuumCleaner irobot = new VacuumCleaner("big","yellow",3,false);
        VacuumCleaner samsung = new VacuumCleaner("small", "blue", 1, true);

        String sizeVC = irobot.getSizeVC();
        System.out.println("Irobot size: " +sizeVC);
        String colorVC = irobot.getColorVC();
        System.out.println("Irobot color: " +colorVC);
        int speedVC = irobot.getSpeedVC();
        System.out.println("Irobot have speeds: " +speedVC);
        irobot.cleaning();

        String sizeVC2 = samsung.getSizeVC();;
        System.out.println("Samsung size: " +sizeVC2);
        String colorVC2 = samsung.getColorVC();
        System.out.println("Samsung color: " +colorVC2);
        int speedVC2 = samsung.getSpeedVC();
        System.out.println("Irobot have speeds: " +speedVC2);
        samsung.engineWorking();

    }
}
