package com.example.table.controller;

import com.example.table.model.PDFDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

/**
 * @ClassName FreeMarkerTestController
 * @Description
 * @Author jianquan.liang
 * @Date 9/6/2019 2:21 PM
 * @Version 1.0
 **/
@Controller
@RequestMapping("/freeMarker")
public class FreeMarkerTestController {

//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("/freeMarkerTest");
//        ArrayList<String> strList = new ArrayList<>();
//        strList.add("first");
//        strList.add("second");
//        strList.add("three");
//        strList.add("four");
//        strList.add("five");
//        modelAndView.addObject("name", "LJQ");
//        modelAndView.addObject("strList", strList);
//
//        ArrayList<PDFDate> PDFDates = new ArrayList<>();
//        PDFDates.add(new PDFDate("test1", "source1", "period1"));
//        PDFDates.add(new PDFDate("test2", "source2", "period2"));
//        PDFDates.add(new PDFDate("test3", "source3", "period3"));
//        PDFDates.add(new PDFDate("test4", "source4", "period4"));
//
//        modelAndView.addObject("pdfList", PDFDates);
//
//        return modelAndView;
//    }

    @RequestMapping()
    public String welcome(Map<String, Object> model) {

        ArrayList<PDFDate> PDFDates = new ArrayList<>();
        PDFDates.add(new PDFDate("test1", "source1", "period1"));
        PDFDates.add(new PDFDate("test2", "source2", "period2"));
        PDFDates.add(new PDFDate("test3", "source3", "period3"));
        PDFDates.add(new PDFDate("test4", "source4", "period4"));

        model.put("pdfList", PDFDates);
        return "freeMarkerTest";
    }
}
