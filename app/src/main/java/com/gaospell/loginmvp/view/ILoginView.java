package com.gaospell.loginmvp.view;

/**
 * <pre>
 *     @author : JerryLiu
 *     e-mail : liudb@gospell.com
 *     time   : 2018/08/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public interface ILoginView {

    void onCLearText();
    void onLoginResult(Boolean result,int code);
}
