package com.DiliGruop.login;


import com.DiliGruop.R;
import com.DiliGruop.base.BaseAcitvity;
import com.DiliGruop.utils.NetUtils;

import butterknife.OnClick;


/**
 * 注册
 */
public class RegistActivity extends BaseAcitvity {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_regist;
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    public void setTitle() {
        super.setTitle();
        tv_title.setText("注册");
    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected void initViewAndData() {

    }
    @OnClick(R.id.bt_regist2)
    public  void registUser(){

    }
}
