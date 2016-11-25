package me.sheepyang.onlylive.utils;

import android.content.Context;

/**
 * Created by SheepYang on 2016/11/25.
 */

public class CacheUtil {

    public static final String IS_INIT = "isInit";
    public static final String INIT_GAME_CASH = "initGameCash";
    public static final String INIT_GAME_DEBT = "initGameDebt";
    public static final String INIT_GAME_DEPOSIT = "initGameDeposit";
    public static final String INIT_GAME_HEALTH = "initGameHealth";
    public static final String INIT_GAME_HOUSE = "initGameHouse";
    public static final String INIT_GAME_HOUSE_TOTAL = "initGameHouseTotal";
    public static final String INIT_GAME_WEEK = "initGameWeek";
    public static final String INIT_GAME_WEEK_TOTAL = "initGameWeekTotal";


    /**
     * 获取游戏是否初始化
     *
     * @param context
     * @return
     */
    public static boolean isInit(Context context) {
        return SPUtil.getBoolean(context, IS_INIT, false);
    }

    /**
     * @param context
     * @param isInit  游戏是否初始化
     */
    public static void setInit(Context context, boolean isInit) {
        SPUtil.putBoolean(context, IS_INIT, isInit);
    }

    /**
     * 获取初始现金
     *
     * @param context
     * @return
     */
    public static String getInitGameCash(Context context) {
        return SPUtil.getString(context, INIT_GAME_CASH);
    }

    public static void setInitGameCash(Context context, String cash) {
        SPUtil.putString(context, INIT_GAME_CASH, cash);
    }

    /**
     * 获取初始负债
     *
     * @param context
     * @return
     */
    public static String getInitGameDebt(Context context) {
        return SPUtil.getString(context, INIT_GAME_DEBT);
    }

    public static void setInitGameDebt(Context context, String debt) {
        SPUtil.putString(context, INIT_GAME_DEBT, debt);
    }

    /**
     * 获取初始存款
     *
     * @param context
     * @return
     */
    public static String getInitGameDeposit(Context context) {
        return SPUtil.getString(context, INIT_GAME_DEPOSIT);
    }

    public static void setInitGameDeposit(Context context, String deposit) {
        SPUtil.putString(context, INIT_GAME_DEPOSIT, deposit);
    }

    /**
     * 获取初始健康
     *
     * @param context
     * @return
     */
    public static String getInitGameHealth(Context context) {
        return SPUtil.getString(context, INIT_GAME_HEALTH);
    }

    public static void setInitGameHealth(Context context, String health) {
        SPUtil.putString(context, INIT_GAME_HEALTH, health);
    }

    /**
     * 获取初始房间已使用空间
     *
     * @param context
     * @return
     */
    public static String getInitGameHouse(Context context) {
        return SPUtil.getString(context, INIT_GAME_HOUSE);
    }

    public static void setInitGameHouse(Context context, String house) {
        SPUtil.putString(context, INIT_GAME_HOUSE, house);
    }

    /**
     * 获取初始房间总容量
     *
     * @param context
     * @return
     */
    public static String getInitGameHouseTotal(Context context) {
        return SPUtil.getString(context, INIT_GAME_HOUSE_TOTAL);
    }

    public static void setInitGameHouseTotal(Context context, String houseTotal) {
        SPUtil.putString(context, INIT_GAME_HOUSE_TOTAL, houseTotal);
    }

    /**
     * 获取初始周数
     *
     * @param context
     * @return
     */
    public static String getInitGameWeek(Context context) {
        return SPUtil.getString(context, INIT_GAME_WEEK);
    }

    public static void setInitGameWeek(Context context, String week) {
        SPUtil.putString(context, INIT_GAME_WEEK, week);
    }

    /**
     * 获取初始总周数
     *
     * @param context
     * @return
     */
    public static String getInitGameWeekTotal(Context context) {
        return SPUtil.getString(context, INIT_GAME_WEEK_TOTAL);
    }

    public static void setInitGameWeekTotal(Context context, String weekTotal) {
        SPUtil.putString(context, INIT_GAME_WEEK_TOTAL, weekTotal);
    }
}