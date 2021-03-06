package com.kozhevin.rootchecks.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.kozhevin.rootchecks.R;
import com.kozhevin.rootchecks.annotation.CheckingMethodType;

import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_BUSYBOX_BINARY;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_DANGEROUS_PROPS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_DEV_KEYS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_HOOKS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_NON_RELEASE_KEYS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_PERMISSIVE_SELINUX;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_RESETPROP;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_SUPER_USER_APK;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_SU_BINARY;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_SU_EXISTS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_TEST_KEYS;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_UNKNOWN;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_WRONG_PATH_PERMITION;
import static com.kozhevin.rootchecks.constant.GeneralConst.CH_TYPE_XPOSED;



public class ChecksHelper {

    private static Bitmap sNonCheck = null;
    private static Bitmap sFound = null;
    private static Bitmap sOk = null;


    private ChecksHelper() {
    }

    @StringRes
    public static int getCheckStringId(@CheckingMethodType int typeCheck) {
        @StringRes int result = 0;
        switch (typeCheck) {
            case CH_TYPE_TEST_KEYS:
                result = R.string.checks_desc_1;
                break;

            case CH_TYPE_DEV_KEYS:
                result = R.string.checks_desc_2;
                break;

            case CH_TYPE_NON_RELEASE_KEYS:
                result = R.string.checks_desc_3;
                break;

            case CH_TYPE_DANGEROUS_PROPS:
                result = R.string.checks_desc_4;
                break;

            case CH_TYPE_PERMISSIVE_SELINUX:
                result = R.string.checks_desc_5;
                break;

            case CH_TYPE_SU_EXISTS:
                result = R.string.checks_desc_6;
                break;

            case CH_TYPE_SUPER_USER_APK:
                result = R.string.checks_desc_7;
                break;

            case CH_TYPE_SU_BINARY:
                result = R.string.checks_desc_8;
                break;

            case CH_TYPE_BUSYBOX_BINARY:
                result = R.string.checks_desc_9;
                break;

            case CH_TYPE_XPOSED:
                result = R.string.checks_desc_10;
                break;

            case CH_TYPE_RESETPROP:
                result = R.string.checks_desc_11;
                break;

            case CH_TYPE_WRONG_PATH_PERMITION:
                result = R.string.checks_desc_12;
                break;

            case CH_TYPE_HOOKS:
                result = R.string.checks_desc_13;
                break;

            case CH_TYPE_UNKNOWN:
            default:
                result = R.string.empty;
        }
        return result;
    }

    public static Bitmap getNonCheck(@NonNull Context pContext) {
        if (sNonCheck == null || sNonCheck.isRecycled()) {
            sNonCheck = BitmapFactory.decodeResource(pContext.getResources(), R.drawable.ic_verified_grey);
        }
        return sNonCheck;
    }

    public static Bitmap getFound(@NonNull Context pContext) {
        if (sFound == null || sFound.isRecycled()) {
            sFound = BitmapFactory.decodeResource(pContext.getResources(), R.drawable.ic_verified_red);
        }
        return sFound;
    }

    public static Bitmap getOk(@NonNull Context pContext) {
        if (sOk == null || sOk.isRecycled()) {
            sOk = BitmapFactory.decodeResource(pContext.getResources(), R.drawable.ic_verified_green);
        }
        return sOk;
    }
}
