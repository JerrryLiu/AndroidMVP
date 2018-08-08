package com.gaospell.loginmvp.presenter;

/**
 * <pre>
 *     @author : JerryLiu
 *     e-mail : liudb@gospell.com
 *     time   : 2018/08/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public interface ILoginPresenter {

    void clear();
    void doLogin(String username,String password);
}
