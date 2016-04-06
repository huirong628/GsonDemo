package com.hrong.test.protocol.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetBaseBean extends IBeanAbs {

    public static final int RET_CODE_DEFAULT = -1;
    public static final int ERR_CODE_DEFAULT = -1;

    public static final String KEY_RET_CODE = "retcode";
    public static final String KEY_ERROR_CODE = "errcode";
    public static final String KEY_ERROR_MSG = "errmsg";

    @Expose
    @SerializedName(KEY_RET_CODE)
    protected int retCode = RET_CODE_DEFAULT;

    @Expose
    @SerializedName(KEY_ERROR_CODE)
    protected int errCode = ERR_CODE_DEFAULT;

    @Expose
    @SerializedName(KEY_ERROR_MSG)
    protected String errMsg = null;

    public int getRetCode() {
        return retCode;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
