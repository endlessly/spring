package com.test.entity;

/**
 * 返回数据
 *
 * @author xueyuan
 * @dater 2016-12-8 0008.
 */
public class ResultMsg {

    private int resultCode = 0;
    private Object resultObject;
    private String resultMs = "";

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultObject() {
        return resultObject;
    }

    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
    }

    public String getResultMsg() {
        return resultMs;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMs = resultMsg;
    }
}
