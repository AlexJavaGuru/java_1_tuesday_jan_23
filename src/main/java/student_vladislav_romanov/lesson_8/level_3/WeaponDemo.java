package student_vladislav_romanov.lesson_8.level_3;

class WeaponDemo {

    public static void main(String[] args) {
        AssaultRifle ak14 = new AssaultRifle("AK14", "Kalashnikov", 30, false);
        Rifle kar98 = new Rifle("K98", "Mauzer", 5);
        Machinegun hk21 = new Machinegun("HK21", "Heckler&Koch", 50, true, "GPMG");
        Machinegun m249 = new Machinegun("M249", "FN Herstal", 200, false, "LMG");

        ak14.shoot();
        ak14.singleShoot();
        ak14.reload();
        kar98.shoot();
        kar98.reload();
        hk21.shoot();
        hk21.reload();
        m249.shoot();
        m249.reload();
    }

}
