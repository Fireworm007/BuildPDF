package com.example.table.service;

import com.example.table.model.PDFDate;
import com.example.table.util.PDFUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PDFServiceImpl
 * @Description
 * @Author jianquan.liang
 * @Date 9/6/2019 5:48 PM
 * @Version 1.0
 **/
@Service
public class PDFServiceImpl implements PDFService {

//    @Autowired
//    private PDFExportConfig pdfExportConfig;

    @Value("${pdfExport.fontSimsun}")
    private String fontSimsun;

    /**
     * 员工绩效考核导出模板文件相对路径
     */
    @Value("${pdfExport.testFtl}")
    private String testFtl;

    /**
     * PDF 文件导出
     *
     * @return
     */
    @Override
    public ResponseEntity<?> export() {
        HttpHeaders headers = new HttpHeaders();

        /**
         * 数据导出(PDF 格式)
         */
        Map<String, Object> dataMap = new HashMap<>(16);
        ArrayList<PDFDate> PDFDates = new ArrayList<>();

        PDFDates.add(new PDFDate("test1", "source1", "period1"));
        PDFDates.add(new PDFDate("test2", "source2", "period2"));
        PDFDates.add(new PDFDate("test3", "source3", "period3"));
        PDFDates.add(new PDFDate("test4", "source4", "period4"));

        dataMap.put("pdfList",PDFDates);

        String htmlStr = PDFUtil.freemarkerRender(dataMap, testFtl);
        byte[] pdfBytes = PDFUtil.createPDF(htmlStr, fontSimsun);
        if (pdfBytes != null && pdfBytes.length > 0) {
            String fileName = System.currentTimeMillis() + (int) (Math.random() * 90000 + 10000) + ".pdf";
            headers.setContentDispositionFormData("attachment", fileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            return new ResponseEntity<byte[]>(pdfBytes, headers, HttpStatus.OK);
        }

        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return new ResponseEntity<String>("{ \"code\" : \"404\", \"message\" : \"not found\" }",
                headers, HttpStatus.NOT_FOUND);
    }
}
