package com.jkb.commonlib.base.action;

/**
 * 只有Fragment用到的Action
 * Created by JustKiddingBaby on 2017/4/16.
 */

public interface BaseFragmentAction {

    /**
     * 设置是否是全屏属性，true为全屏
     */
    boolean requestFullScreenStyle();

    /**
     * 页面是否被销毁
     */
    boolean isActive();

}
