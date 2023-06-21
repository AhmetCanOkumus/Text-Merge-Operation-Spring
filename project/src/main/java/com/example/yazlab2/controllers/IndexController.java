package com.example.yazlab2.controllers;

import com.example.yazlab2.models.Save;
import com.example.yazlab2.models.User;
import com.example.yazlab2.repositories.SaveRepository;
import com.example.yazlab2.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {
    List<String> list=new ArrayList<String>();
    String birlesmistring;
    @Autowired
    private SaveRepository saveRepository;

    private IndexService indexservice;


    @GetMapping("/")
    public String index(){
        return "index";
    }




    @RequestMapping(value="/birlestir",method= RequestMethod.POST)
    public void Merge()
    {

        indexservice.register();

    }

    @PostMapping("/ekle")
    public String ekle(@ModelAttribute User user){

        list.add(user.getMetinbir());

        list.add(user.getMetiniki());

        for(int i=0;i<list.size();i++){
            if(list.get(i)==""){
                list.remove(i);
            }
        }

        System.out.println(list.size());


        return "index";

    }

    @PostMapping("/kaydet")
    public String kaydet(){


        Save metin=new Save();
        metin.setBirlesmismetin(birlesmistring);
        saveRepository.save(metin);
        list.clear();
        return("index");
    }




}



