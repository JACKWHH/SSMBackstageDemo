package com.wdhcr.service;

import com.wdhcr.mapper.GoodsMapper;
import com.wdhcr.po.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/*
* Service层的商品操作实现类
*
* */
@Service(value = "goodsServicesImp")
public class GoodsServicesImp implements GoodsServices {
    @Resource(name = "goodsMapper")
    private GoodsMapper goodsMapper;

    @Override
    public int addGood(Goods goods) {
        goodsMapper.addGood(goods);
        return 1;
    }

    @Override
    public int deleteGood(int id) {
        goodsMapper.deleteGood(id);
        return 1;
    }

    @Override
    public int updateGood(Goods goods) {
        goodsMapper.updateGood(goods);

        return 1;
    }

    @Override
    public Goods findGoodById(int id) {
        Goods goodById = goodsMapper.findGoodById(id);
        return goodById;
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsMapper.getAllGoods();
    }
}
