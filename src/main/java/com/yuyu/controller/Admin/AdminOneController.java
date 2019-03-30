package com.yuyu.controller.Admin;

import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Adminone;
import com.yuyu.pojo.Admintwo;
import com.yuyu.service.IAdminOneService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/adminone")
public class AdminOneController {
    @Autowired
    private IAdminOneService iAdminOneService;

    @RequestMapping(value = "login.do")
    @ResponseBody
    public ServerResponse<Adminone> login(String username, String password) {
        if (StringUtils.isBlank(username)) {
            return ServerResponse.createByErrorMessage("用户名为空，请输入用户名");
        }
        System.out.println("访问访问访问");
        return iAdminOneService.Login(username, password);
    }

    @RequestMapping(value = "register.do")
    @ResponseBody
    public ServerResponse<String> register(Adminone adminone) {
        return iAdminOneService.Register(adminone);
    }

    @RequestMapping(value = "addadmintwo.do")
    @ResponseBody
    public ServerResponse<String> addadmintwo(Admintwo admintwo) {
        return iAdminOneService.AddAdmintwo(admintwo);
    }

}
