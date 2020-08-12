package com.czxy.dao;

import com.czxy.pojo.Goods;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2020/08/07
 * @infos
 */
@org.apache.ibatis.annotations.Mapper
public interface GoodsDao extends Mapper<Goods> {

    @Select("select * from tbl_goods")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "category",column = "cid",one = @One(select = "com.czxy.dao.CategoryDao.selectByPrimaryKey"))
    })
    List<Goods> findAllGoods();

}
