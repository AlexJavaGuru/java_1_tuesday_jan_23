package student_natalja_semitseva.Lesson_9_Task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

    @Override
    public boolean canLogin() {
        return false;
    }
}

