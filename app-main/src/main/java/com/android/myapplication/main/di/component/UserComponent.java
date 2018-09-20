package com.android.myapplication.main.di.component;

import com.android.myapplication.main.di.module.UserModule;
import com.android.myapplication.main.mvp.ui.activity.UserActivity;
import com.android.myapplication.common.di.component.AppComponent;
import com.android.myapplication.common.di.scope.ActivityScope;

import dagger.Component;

/**
 * ================================================
 * 展示 Component 的用法
 *
 * @see <a href="https://github.com/JessYanCoding/MVPArms/wiki#2.4.6">Component wiki 官方文档</a>
 * ================================================
 */
@ActivityScope
@Component(modules = UserModule.class, dependencies = AppComponent.class)
public interface UserComponent {
    void inject(UserActivity activity);
}
