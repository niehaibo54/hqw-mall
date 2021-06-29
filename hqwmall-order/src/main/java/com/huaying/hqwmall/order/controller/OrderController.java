package com.huaying.hqwmall.order.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huaying.common.controller.BaseController;
import com.huaying.common.page.PageData;
import com.huaying.common.page.Result;
import com.huaying.hqwmall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单
 *
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-10 11:58:59
 */
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;

    /**
     * 保存
     */
    @RequestMapping("/save")
    public Result save() {
        Result result = new Result<>();
        PageData pd = this.getPageData();
        try {
            orderService.save(pd);
            result.success("添加成功！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            result.setCode(500);
            result.setMessage(e.getMessage());
        }
        return result;
    }


    @RequestMapping("/list")
    public Result list() {
        Result result = new Result<>();
        PageData pd = this.getPageData();
        result.setResult(orderService.list());
        return result;
    }


    @RequestMapping("/listPage")
    public Result listPage() {
        Result result = new Result<>();
        PageData pd = this.getPageData();
        IPage<PageData> page = orderService.orderListPage(pd);
        result.setResult(page);
        return result;
    }

    @GetMapping("/test")
    public String test(){
        return orderService.test();
    }
}
