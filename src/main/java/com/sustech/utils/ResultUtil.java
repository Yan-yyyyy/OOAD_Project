package com.sustech.utils;

import com.sustech.domain.Result;

public class ResultUtil {
    public static Result success(Object o){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData(o);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }



}
