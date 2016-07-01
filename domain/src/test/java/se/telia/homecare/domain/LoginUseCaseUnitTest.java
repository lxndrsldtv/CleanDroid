package se.telia.homecare.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LoginUseCaseUnitTest {
    @Test
    public void login_presenter_does_nothing_when_token_is_valid() throws Exception {

        User testUser = new User();
        testUser.setName("test user");
        testUser.setPassword("password");

        Session testSession = new Session();
        //testSession.setToken("test_token");

//        LoginView testLoginView = new TestLoginView();

//        LoginUseCase sut = new LoginUseCase(testUser,
//                                            testSession,
//                                            new LoginPresenter(testLoginView),
//                                            new SMSCodePresenter(),
//                                            new CommandLoginUser(testUser),
//                                            new CheckSMSCodeCommand());
//
//        sut.start();

        assertEquals("valid token was changed by login interactor",
                     "test_token", testSession.getToken());

    }
}