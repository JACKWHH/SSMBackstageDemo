package com.wdhcr.controller;

import com.wdhcr.po.Goods;
import com.wdhcr.service.GoodsServicesImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class GoodsController {
    @Resource(name = "goodsServicesImp")
    private GoodsServicesImp goodsServicesImp;


    //添加商品
    @RequestMapping(value = "/addGoods")
    public void addGoods(Goods goods, HttpServletResponse response) {

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        System.out.println("*********" + goods.getName() + goods.getType());
        //调用service层信息
        int row = goodsServicesImp.addGood(goods);
        //创建页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            writer.println("<script>\n" +
                    "    alert(\"添加成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");

        } else {
            writer.println("<script>\n" +
                    "    alert(\"添加失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }

    }
    //查询所有商品
    @RequestMapping(value = "/GoodsAll")
    public ModelAndView getAllGoods() {
        List<Goods> allGoods = goodsServicesImp.getAllGoods();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goodslist", allGoods);
        modelAndView.setViewName("goods-list.jsp");
        return modelAndView;
    }

    //修改商品信息
    //首先根据id查询商品信息
    @RequestMapping(value = "/findGoodsById")
    public ModelAndView findGoodsById(int id) {
        Goods goodById = goodsServicesImp.findGoodById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goodById);
        modelAndView.setViewName("goods-edit.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/updateGoods")
    public void updateGoods(Goods goods, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        int row = goodsServicesImp.updateGood(goods);
        //获取页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row > 0) {
            writer.println("<script>\n" +
                    "    alert(\"修改成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        } else {
            writer.println("<script>\n" +
                    "    alert(\"修改失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }

    }
    //删除商品
    @RequestMapping(value = "/deleteGoods")
    public void deleteGoods(int id, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        int row = goodsServicesImp.deleteGood(id);
        //获取页面打印对象
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (row>0){


            writer.println("<script>\n" +
                    "    alert(\"删除成功！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }else {
            writer.println("<script>\n" +
                    "    alert(\"删除失败！！\");\n" +
                    "    window.location = \"index.jsp\";\n" +
                    "</script>");
        }
    }

}
