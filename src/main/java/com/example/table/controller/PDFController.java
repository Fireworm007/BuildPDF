package com.example.table.controller;

import com.example.table.service.PDFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PDFController
 * @Description
 * @Author jianquan.liang
 * @Date 9/6/2019 5:51 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("api/pdf/")
public class PDFController {
    @Autowired
    private PDFService pdfService;

    /**
     * PDF 文件导出
     * 使用 a 链接即可下载;如果为 ajax/vue,则需要转换为 form 表单格式
     * eg: http://${apiAddress}/api/demo/common/export?key1=${key}&key2=${key2}
     */
    @RequestMapping(value = "/export", method = {RequestMethod.POST, RequestMethod.GET},
            produces = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> export(){
        try {
            ResponseEntity<?> responseEntity = pdfService.export();
            return responseEntity;
        } catch (Exception e) {
            e.printStackTrace();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return new ResponseEntity<String>("{ \"code\" : \"404\", \"message\" : \"not found\" }",
                headers, HttpStatus.NOT_FOUND);
    }

}
