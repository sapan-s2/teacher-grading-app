package com.grading.teacher.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sjain on 5/25/20.
 */

@RestController
@Slf4j
public class UIController {


  @GetMapping("/feedback")
  public ModelAndView feedback( ) {
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("version", "0.1");
    return mav;

  }



}
