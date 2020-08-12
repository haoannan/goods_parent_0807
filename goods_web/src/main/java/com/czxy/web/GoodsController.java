package com.czxy.web;

import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;
import com.czxy.pojo.Msg;
import com.czxy.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/08/07
 * @infos
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    /**
     * 查询所有分类
     * @return
     */
    @GetMapping("/allCategory")
    public ResponseEntity<List<Category>> allCategory(){
        List<Category> clist = goodsService.allCategory();
        System.out.println(clist);
        return ResponseEntity.ok(clist);
    }

    /**
     * 异步校验商品名
     * @return
     */
    @GetMapping("/checkName")
    public @ResponseBody Msg checkName(@RequestParam String goodName){
        Boolean flag = goodsService.checkName(goodName);
        Msg msg = new Msg(flag + "");
        return msg;
    }

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @PostMapping("/addGoods")
    public String addGoods(Goods goods){
        goodsService.addGoods(goods);
        return "redirect:/goods/list.jsp";
    }

    /**
     * 查询商品列表
     * @return
     */
    @GetMapping("/findAllGoods")
    public @ResponseBody List<Goods> findAllGoods(){
        List<Goods> glist =goodsService.findAllGoods();
        return glist;
    }

}
