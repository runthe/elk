package com.soo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {

  @RequestMapping(value = "/shot")
  public void shot() {
    log.info("test {}", "샷 로그");
  }
}
