package com.DiliGruop.login;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.DiliGruop.R;
import com.DiliGruop.UserSet.activity.UserCenterView;
import com.DiliGruop.base.BaseAcitvity;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 登录 Activity
 */
public class LoginActivity extends BaseAcitvity {
    @Bind(R.id.input_username)
    AutoCompleteTextView username;
    @Bind(R.id.input_password)
    EditText et_password;
    @Bind(R.id.login_progress)
    ProgressBar loginProgress;
    @Bind(R.id.bt_regist)
    Button bt_regist;
    @Bind(R.id.bt_login)
    Button bt_login;
    @Bind(R.id.comm_title)
    TextView tv_title;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void onNetworkConnected(com.DiliGruop.utils.NetUtils.NetType type) {

    }


    @Override
    protected void onNetworkDisConnected() {

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        ButterKnife.bind(this);
//        tv_title.setText("登录");
//    }

    @Override
    protected void initViewAndData() {
        tv_title.setText("登录");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.finish();
    }

    @OnClick(R.id.bt_login)
    public void doLogin() {
        readyGo(UserCenterView.class);
    }

    @OnClick(R.id.bt_regist)
    public void doRegist() {
        readyGo(RegistActivity.class);
    }
//    @OnClick(R.id.bt_regist2)
}
