package com.example.table.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GeneratePDF
 * @Description
 * @Author jianquan.liang
 * @Date 9/6/2019 5:08 PM
 * @Version 1.0
 **/
public class GeneratePDF {
    /**
     * 宋体字体文件相对路径
     */
    @Value("${pdfExport.fontSimsun}")
    private static String fontSimsun;

    /**
     * 员工绩效考核导出模板文件相对路径
     */
    @Value("${pdfExport.testFtl}")
    private static String testFtl;

    public static void main(String[] args) {

        generatePDF();

    }
    private static void generatePDF(){
        /**
         * 数据导出(PDF 格式)
         */
        Map<String, Object> dataMap = new HashMap<>(16);
        dataMap.put("statisticalTime",new Date().toString());

        String htmlStr = PDFUtil.freemarkerRender(dataMap, testFtl);
        byte[] pdfBytes = PDFUtil.createPDF(htmlStr, fontSimsun);
        if (pdfBytes != null && pdfBytes.length > 0) {
            String fileName = System.currentTimeMillis() + (int) (Math.random() * 90000 + 10000) + ".pdf";
        }
    }
}
