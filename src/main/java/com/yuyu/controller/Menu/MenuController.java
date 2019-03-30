package com.yuyu.controller.Menu;

import com.github.pagehelper.PageInfo;
import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Menu;
import com.yuyu.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("menu/")
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    /**
     * 增加菜品目录
     *
     * @param menu
     * @return
     */
    @RequestMapping("addmenu.do")
    @ResponseBody
    public ServerResponse<Menu> AddMenu(Menu menu) {
        return iMenuService.addmenu(menu);
    }

    /**
     * 删除菜品
     *
     * @param menu
     * @return
     */
    @RequestMapping("deletemenu.do")
    @ResponseBody
    public ServerResponse<String> DeleteMenu(Menu menu) {
        //先获取id，在删除
        return iMenuService.DeleteMenu(menu.getFoodname());
    }

    /**
     * 修改菜品
     *
     * @param menu
     * @return
     */
    @RequestMapping("updatemenu.do")
    @ResponseBody
    public ServerResponse<Menu> UpdateMenu(Menu menu) {
        return iMenuService.UpdateMenu(menu);
    }

    /**
     * 根据名称查找菜品的具体信息
     *
     * @param foodname
     * @return
     */
    @RequestMapping("selectmenubyname.do")
    @ResponseBody
    public ServerResponse<Menu> SelectMenuByname(String foodname) {
        return iMenuService.SelectMenuByname(foodname);
    }

    /**
     * 查找所有的信息
     * todo 没有完成
     *
     * @return
     */
    @RequestMapping("selectall.do")
    @ResponseBody
    public ServerResponse<PageInfo> GetAll(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return iMenuService.SelectAll(pageNum, pageSize);
    }

    public ServerResponse upload(MultipartFile file, HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("upload");

    }
}
