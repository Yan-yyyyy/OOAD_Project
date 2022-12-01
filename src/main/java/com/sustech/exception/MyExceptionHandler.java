package com.sustech.exception;

import com.sustech.domain.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
//    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandler(Exception e){
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(e.getMessage());
        return result;
    }


    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result exceptionHandler(MyException e){
        Result result = new Result();
        result.setCode(e.getCode());
        result.setMsg(e.getMsg());
        return result;
    }


}
