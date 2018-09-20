package com.android.myapplication.main.mvp.ui.adapter;

import android.view.View;

import com.android.myapplication.main.R;
import com.android.myapplication.common.base.BaseHolder;
import com.android.myapplication.common.base.DefaultAdapter;

import java.util.List;

import com.android.myapplication.main.mvp.model.entity.User;
import com.android.myapplication.main.mvp.ui.holder.UserItemHolder;

/**
 * ================================================
 * 展示 {@link DefaultAdapter} 的用法
 * ================================================
 */
public class UserAdapter extends DefaultAdapter<User> {
    public UserAdapter(List<User> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<User> getHolder(View v, int viewType) {
        return new UserItemHolder(v);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.recycle_list;
    }
}
