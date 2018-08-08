package com.gaospell.loginmvp.presenter;

import android.util.Log;

import com.gaospell.loginmvp.model.User;
import com.gaospell.loginmvp.view.ILoginView;

/**
 * <pre>
 *     @author : JerryLiu
 *     e-mail : liudb@gospell.com
 *     time   : 2018/08/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public class LoginPrisenter implements ILoginPresenter {
    private static final String TAG = "LoginPrisenter";
    private ILoginView mLoginView;
    private User mUser;

    public LoginPrisenter(ILoginView view) {
        mLoginView = view;
        mUser = new User("Liu","12345678");
    }

    @Override
    public void clear() {
        mLoginView.onCLearText();
    }

    @Override
    public void doLogin(String username, String password) {
        Log.d(TAG, "userName: "+username +"; password: "+password);
        boolean result = false;
        int code =0;
        if (username.equals(mUser.getUserName()) && password.equals(mUser.getPassword())){
            result = true;
            code =1;
        }else {
            result = false;
            code =0;
        }


        mLoginView.onLoginResult(result,code);
    }
}
