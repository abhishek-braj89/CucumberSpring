package com.abhi.cucspring.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhi.cucspring.controller.MathsController;
import com.abhi.cucspring.entity.MathResult;

@Configuration
@ComponentScan(basePackageClasses= {MathsController.class,MathResult.class})
public class SampleConfiguration {
}
