package com.gaospell.loginmvp.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gaospell.loginmvp.R;
import com.gaospell.loginmvp.presenter.ILoginPresenter;
import com.gaospell.loginmvp.presenter.LoginPrisenter;
import com.gaospell.loginmvp.view.ILoginView;

/**
 * <pre>
 *     @author : JerryLiu
 *     e-mail : liudb@gospell.com
 *     time   : 2018/8/8
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class LoginActivity extends AppCompatActivity
        implements View.OnClickListener, ILoginView {

    private Button mLoginBtn;
    private Button mClearBtn;
    private EditText mUserName;
    private EditText mPassword;
    private ILoginPresenter mLoginPresenter;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginBtn = findViewById(R.id.login_btn);
        mClearBtn = findViewById(R.id.clear_btn);
        mUserName = findViewById(R.id.user_name_edit);
        mPassword = findViewById(R.id.password_edit);

        mLoginBtn.setOnClickListener(this);
        mClearBtn.setOnClickListener(this);

        mLoginPresenter = new LoginPrisenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                mLoginPresenter.doLogin(mUserName.getText().toString(),mPassword.getText().toString());
                break;
            case R.id.clear_btn:
                mLoginPresenter.clear();
                break;
            default:
                break;
        }
    }

    @Override
    public void onCLearText() {

        mUserName.setText("");
        mPassword.setText("");

    }

    @Override
    public void onLoginResult(Boolean result, int code) {
        if(result){
            Log.d(TAG, "onLoginResult: success");
            Toast.makeText(this,"Login Success!",Toast.LENGTH_LONG).show();

        }else {
            Log.d(TAG, "onLoginResult: failed");
            Toast.makeText(this,"Login Failed!",Toast.LENGTH_LONG).show();
        }
    }
}
