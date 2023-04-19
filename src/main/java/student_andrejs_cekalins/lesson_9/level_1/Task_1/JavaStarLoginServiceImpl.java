package student_andrejs_cekalins.lesson_9.level_1.Task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
