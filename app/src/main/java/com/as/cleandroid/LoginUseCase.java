package com.as.cleandroid;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginUseCase {

    User mUser;
    Session mSession;

    LoginPresenter mLoginPresenter;
    SMSCodePresenter mSMSCodePresenter;

    CommandLoginUser mCommandLoginUser;
    CheckSMSCodeCommand mCheckSMSCodeCommand;

    public LoginUseCase(User aUser,
                        Session aSession,
                        LoginPresenter aLoginPresenter,
                        SMSCodePresenter aSMSCodePresenter,
                        CommandLoginUser aCommandLoginUser,
                        CheckSMSCodeCommand aCheckSMSCodeCommand)
    {
        mUser = aUser;
        mSession = aSession;
        mLoginPresenter = aLoginPresenter;
        mSMSCodePresenter = aSMSCodePresenter;
        mCommandLoginUser = aCommandLoginUser;
        mCheckSMSCodeCommand = aCheckSMSCodeCommand;
    }

    public void start() {
        if (mSession.tokenIsValid()) return;
        //if (mUser.LoginCredentialsAreValid()) mCommandLoginUser.execute(mUser);
        mLoginPresenter.askUserToFillLoginAndPassword(mUser);
        //mCommandLoginUser.execute();
    }

    public void setPresenter(Presenter aLoginPresenter) {
        mLoginPresenter = (LoginPresenter) aLoginPresenter;
    }

}
