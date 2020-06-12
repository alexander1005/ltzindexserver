package com.ltz.controller;

import com.ltz.service.IndexService;
import org.assertj.core.util.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("index")
public class IndexController {

  @Autowired
  IndexService indexService;

  @GetMapping("add")
  public Map<String,Object> addSearch(String add){
    indexService.add(add);
    return Maps.newHashMap("code",200);
  }

}
