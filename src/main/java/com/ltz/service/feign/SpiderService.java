package com.ltz.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "LTZSPIDER")
public interface SpiderService {

  @RequestMapping(value = "spider/search",method = RequestMethod.GET)
  Map<String,Object> search(@RequestParam("key") String key, @RequestParam("type")String type);


}
