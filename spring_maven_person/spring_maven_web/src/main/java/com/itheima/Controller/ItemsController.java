package com.itheima.Controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Items> itemsList = itemsService.findAll();
        modelAndView.addObject("item",itemsList);
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }

    @RequestMapping("/findById")
    public ModelAndView findById(ModelAndView modelAndView){
        Items items = itemsService.findById(1);
        modelAndView.addObject("item",items);
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }
}
