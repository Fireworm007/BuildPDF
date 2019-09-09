package com.example.table.service;

import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;

public interface PDFService {
    /**
     * PDF 文件导出
     * @return
     */
    ResponseEntity<?> export();

    void preview(HttpServletResponse response);
}
