package com.czxy.service.impl;

import com.czxy.dao.CategoryDao;
import com.czxy.dao.GoodsDao;
import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;
import com.czxy.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/08/07
 * @infos
 */
@Service
@Transactional
public class goodsServiceImpl implements GoodsService {

    @Resource
    private CategoryDao categoryDao;
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Category> allCategory() {
        return categoryDao.selectAll();
    }

    @Override
    public Boolean checkName(String goodName) {
        Example example = new Example(Goods.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("goods_name",goodName);
        Goods result = goodsDao.selectOneByExample(example);
        if(result==null){
            return true;
        }
        return false;
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.insert(goods);
    }

    @Override
    public List<Goods> findAllGoods() {
        return goodsDao.findAllGoods();
    }
}
