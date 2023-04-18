package student_nikita_visnakovs.lesson_9.level_1;

public class JavaStarLoginServiceImpl implements JavaStarService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
