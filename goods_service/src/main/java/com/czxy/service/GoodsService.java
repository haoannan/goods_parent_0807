package com.czxy.service;

import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;

import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/08/07
 * @infos
 */
public interface GoodsService {

    /**
     * 查询所有分类
     * @return
     */
    List<Category> allCategory();

    /**
     * 异步校验商品名
     * @param goodName
     * @return
     */
    Boolean checkName(String goodName);

    /**
     * 添加商品
     * @param goods
     */
    void addGoods(Goods goods);

    /**
     * 查询商品列表
     * @return
     */
    List<Goods> findAllGoods();


}
