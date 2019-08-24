package com.wdhcr.service;

import com.wdhcr.po.Goods;

import java.util.List;

/*
 * 商品类的规范接口
 * */
public interface GoodsServices {

    //定义user接口规范
    //添加商品
    int addGood(Goods goods);
    //删除商品
    int deleteGood(int id);
    //更新商品
    int updateGood(Goods goods);
    //根据id获取商品
    Goods findGoodById(int id);
    //获取所有的商品
    List<Goods> getAllGoods();
}
