package com.yuyu.controller.StoreByOne;

import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Store;
import com.yuyu.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 店面部分
 * 增加店面，修改店面，修改店面
 * 不可以删除店面信息
 */
@Controller
@RequestMapping("storeByAdmin")
public class StoreController {

    @Autowired
    private IStoreService iStoreService;

    /**
     * 增加店铺信息
     *
     * @param store
     * @return
     */
    @RequestMapping(value = "addstore.do")
    @ResponseBody
    public ServerResponse<Store> AddStore(Store store, String username) {
        if (username == null) {
            return ServerResponse.createByErrorMessage("此用户没有此权限");
        }

        return iStoreService.add_Store(store, username);
    }

    /**
     * 根据管理员id查询店面信息
     *
     * @param username
     * @return
     */
    @RequestMapping(value = "showstorebyadmin.do")
    @ResponseBody
    public ServerResponse<Store> ShowStore_ByAdminId(String username) {
        if (username == null) {
            return ServerResponse.createByErrorMessage("此用户没有此权限");
        }

        return iStoreService.show_Store_byadmin(username);
    }

    /**
     * 根据店面id查询店面信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "showstorebyid.do")
    @ResponseBody
    public ServerResponse<Store> ShowStore_Bystoreid(int id) {
        if (id < 1) {
            return ServerResponse.createByErrorMessage("查询错误");
        }

        return iStoreService.show_Store_bystore(id);
    }

    /**
     * 更新店面信息
     *
     * @param store
     * @return
     */
    @RequestMapping(value = "updatestore.do")
    @ResponseBody
    public ServerResponse<String> update_Store(Store store) {
        return iStoreService.update_Store(store);
    }
}
