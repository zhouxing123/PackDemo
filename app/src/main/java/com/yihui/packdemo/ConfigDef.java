package com.yihui.packdemo;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/9]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
public class ConfigDef {

    //属于哪个 oemId, 对应的app类型
    public static final int CURRENT_USER_TYPE = BuildConfig.UserType;

    //
    public class UserType {

        public static final int USER_TYPE_ONE = 1;
        public static final int USER_TYPE_TWO = 2;
        public static final int USER_TYPE_THREE = 3;
        public static final int USER_TYPE_FOUR = 4;

    }

    public static class UserName {

        public static String getUserName() {

            switch (CURRENT_USER_TYPE) {

                case UserType.USER_TYPE_ONE:
                    return "测试1";
                case UserType.USER_TYPE_TWO:
                    return "测试2";
                case UserType.USER_TYPE_THREE:
                    return "测试3";
                case UserType.USER_TYPE_FOUR:
                    return "测试4";
                default:
                    return "测试0000";

            }

        }


    }


}
