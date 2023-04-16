package student_vladislav_romanov.lesson_9.level_7;

import student_vladislav_romanov.TestUtil;

public class WeaponTest extends TestUtil {

    public static void main(String[] args) {
        WeaponTest weaponTest = new WeaponTest();
        weaponTest.ak74LoadingTestSucceed();
        weaponTest.ak74LoadingTestFailed();
        weaponTest.ak101LoadingTestSucceed();
        weaponTest.ak101LoadingTestFailed();
        weaponTest.m4a1LoadingTestSucceed();
        weaponTest.m4a1LoadingTestFailed();
        weaponTest.printStat();
    }

    public void ak74LoadingTestSucceed() {
        AK74 ak74 = new AK74();
        String expected = "5.45x39 shells loaded";
        String current = ak74.load.loadShells();

        printResult(current.equals(expected), "ak74LoadingTestSucceed");
    }

    public void ak74LoadingTestFailed() {
        AK74 ak74 = new AK74();
        String expected = "7.62x39 shells loaded";
        String current = ak74.load.loadShells();

        printResult(!current.equals(expected), "ak74LoadingTestFailed");
    }

    public void ak101LoadingTestSucceed() {
        AK101 ak101 = new AK101();
        String expected = "5.56x45 shells loaded";
        String current = ak101.load.loadShells();

        printResult(current.equals(expected), "ak101LoadingTestSucceed");
    }

    public void ak101LoadingTestFailed() {
        AK101 ak101 = new AK101();
        String expected = "7.62x39 shells loaded";
        String current = ak101.load.loadShells();

        printResult(!current.equals(expected), "ak101LoadingTestFailed");
    }

    public void m4a1LoadingTestSucceed() {
        M4A1 m4a1 = new M4A1();
        String expected = "5.56x45 shells loaded";
        String current = m4a1.load.loadShells();

        printResult(current.equals(expected), "m4a1LoadingTestSucceed");
    }

    public void m4a1LoadingTestFailed() {
        M4A1 m4a1 = new M4A1();
        String expected = "7.62x39 shells loaded";
        String current = m4a1.load.loadShells();

        printResult(!current.equals(expected), "m4a1LoadingTestFailed");
    }

}
