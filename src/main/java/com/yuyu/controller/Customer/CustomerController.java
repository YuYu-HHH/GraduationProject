package com.yuyu.controller.Customer;

import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Customer;
import com.yuyu.service.ICustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("customer/")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse<Customer> addCustomer(Customer customer){
        return iCustomerService.addCustomer(customer);
    }
    @RequestMapping("login.do")
    @ResponseBody
    public ServerResponse<Customer> loginCustomer(String phone, String password){
        if (StringUtils.isBlank(phone)) {
            return ServerResponse.createByErrorMessage("电话号码为空，请输入用户名");
        }
        return iCustomerService.loginCustomer(phone,password);
    }
    @RequestMapping("delete.do")
    @ResponseBody
    public ServerResponse<String> deleteCustomer(Customer customer){
        return iCustomerService.deleteCustomer(customer);
    }
    @RequestMapping("check.do")
    @ResponseBody
    public ServerResponse<Customer> checkCustomer(String phone){
        return iCustomerService.checkCustomer(phone);
    }
    @RequestMapping("updatecustomerpassword.do")
    @ResponseBody
    public ServerResponse<String> updatePassword(String phone,String password,String newPassword){
        return iCustomerService.updatePassword(phone,password,newPassword);
    }
}
