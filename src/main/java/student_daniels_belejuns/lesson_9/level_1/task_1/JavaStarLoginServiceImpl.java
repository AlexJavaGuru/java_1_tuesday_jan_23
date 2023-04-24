package student_daniels_belejuns.lesson_9.level_1.task_1;

class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
