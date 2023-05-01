package student_ilya_tihonov.lesson_9.level_1;

import student_ilya_tihonov.lesson_9.level_1.JavaStarLoginService;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
