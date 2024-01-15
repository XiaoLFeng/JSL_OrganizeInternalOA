package com.jsl.oa.controllers;

import com.jsl.oa.services.MailService;
import com.jsl.oa.utils.BaseResponse;
import com.jsl.oa.utils.ResultUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomController implements ErrorController {

    private final MailService mailService;

    @RequestMapping("/")
    public BaseResponse index() {
        return ResultUtil.success("欢迎使用JSL-OA系统，服务器处于正常状态");
    }

    @RequestMapping("/error")
    public ResponseEntity<BaseResponse> handleError() {
        return ResultUtil.error("PageNotFound", 404, "请求资源不存在");
    }

    @RequestMapping("/unauthorized")
    public ResponseEntity<BaseResponse> handleUnauthorized() {
        return ResultUtil.error("Unauthorized", 401, "未授权");
    }
}
