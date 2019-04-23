package com.yuyu.controller.Evaluation;

import com.github.pagehelper.PageInfo;
import com.yuyu.common.ServerResponse;
import com.yuyu.pojo.Evaluation;
import com.yuyu.service.IEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("evaluation/")
public class EvaluationController {

    @Autowired
    private IEvaluationService iEvaluationService;

    /**
     * 通过菜品的id获取评价信息
     * @return
     */
    @RequestMapping("selectallBymenuId.do")
    @ResponseBody
    public ServerResponse<PageInfo> SelectAllByMenuId(int menu_id,@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return iEvaluationService.SelectAllByMenuId(menu_id,pageNum,pageSize);
    }
    /**
     * 通过菜品的id获取评价信息
     * @return
     */
    @RequestMapping("selectAllByEvaluationId.do")
    @ResponseBody
    public ServerResponse<Evaluation> SelectAllByEvaluationId(int evaluationId ) {
        return iEvaluationService.SelectAllByEvaluationId(evaluationId);
    }

    /**
     * 通过菜品的id获取评价信息
     * todo 其实没有完成，还没有上传图片
     * @return
     */
    @RequestMapping("addEvaluation.do")
    @ResponseBody
    public ServerResponse<Evaluation> InsertEvaluation(Evaluation evaluation ) {
        return iEvaluationService.InsertEvaluation(evaluation);
    }
}
