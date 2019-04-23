package com.yuyu.controller.Find;

import com.github.pagehelper.PageInfo;
import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Find;
import com.yuyu.service.IFindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("find")
public class FindController {

    @Autowired
    private IFindService iFindService;

    @RequestMapping("selectallfind.do")
    @ResponseBody
    public ServerResponse<PageInfo> GetAll(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return iFindService.SelectAll(pageNum, pageSize);
    }

    @RequestMapping("selectfindByid.do")
    @ResponseBody
    public ServerResponse<Find> selectfindByid(int id) {
        return iFindService.selectfindByid(id);
    }
}
