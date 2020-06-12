package com.ltz.service.impl;

import com.ltz.service.IndexService;
import com.ltz.service.feign.SpiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IndexServiceImpl implements IndexService {

  @Autowired
  SpiderService spiderService;

  @Override
  public void add(String add) {
    Map<String, Object> smzdm = spiderService.search(add, "smzdm");
    Map<String, Object> jd = spiderService.search(add, "jd");
  }
}
