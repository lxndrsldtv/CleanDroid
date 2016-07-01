package se.telia.homecare.domain;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginUseCase {

    User mUser;
    //Session mSession;

    //LoginPresenter mLoginPresenter;
    //SMSCodePresenter mSMSCodePresenter;

    CommandLoginUser mCommandLoginUser;
    CheckSMSCodeCommand mCheckSMSCodeCommand;

    public LoginUseCase(User aUser,
                        //Session aSession,
                        //LoginPresenter aLoginPresenter,
                        //SMSCodePresenter aSMSCodePresenter,
                        CommandLoginUser aCommandLoginUser,
                        CheckSMSCodeCommand aCheckSMSCodeCommand)
    {
        mUser = aUser;
        //mSession = aSession;
        //mLoginPresenter = aLoginPresenter;
        //mSMSCodePresenter = aSMSCodePresenter;
        mCommandLoginUser = aCommandLoginUser;
        mCheckSMSCodeCommand = aCheckSMSCodeCommand;
    }

    public void start() {
        /*
        1. if the user is already logged then do nothing
        if (user.isLoggedIn) startNextUseCaseInChain (for example choosing organisations and roles)
        return


        if (user.isNotLoggedIn)


         */


        //if (mSession.tokenIsValid()) return;
        //
        //if (user.LoginCredentialsAreValid()) {
        // mCommandHandler.execute(CommandFactory.createLoginUserCommandForUser(user));
        //mLoginPresenter.askUserToFillLoginAndPassword(mUser);
        //mCommandLoginUser.execute();
    }

//    public void setPresenter(Presenter aLoginPresenter) {
//        mLoginPresenter = (LoginPresenter) aLoginPresenter;
//    }

}
