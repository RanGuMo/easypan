package com.easypan.controller;

import com.easypan.entity.constants.Constants;
import com.easypan.entity.dto.CreateImageCode;
import com.easypan.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author MoRanGu
 * @since 2023-08-18
 */
@Controller
public class UserInfoController {
    @Autowired
    private IUserInfoService userInfoService;

    // 获取验证码接口
    @RequestMapping("/checkCode")
    public void checkCode(HttpServletResponse response, HttpSession session,Integer type) throws
            IOException{
        CreateImageCode vCode = new CreateImageCode(130, 38, 5, 10);
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires",0);
        response.setContentType("image/jpeg");
        String code = vCode.getCode();
        if(type==null || type==0){
            session.setAttribute(Constants.CHECK_CODE_KEY,code);
        }else{
            session.setAttribute(Constants.CHECK_CODE_KEY_EMAIL,code);
        }
        vCode.write(response.getOutputStream());
    }

}
