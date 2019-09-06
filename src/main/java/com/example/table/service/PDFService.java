package com.example.table.service;

import org.springframework.http.ResponseEntity;

public interface PDFService {
    /**
     * PDF 文件导出
     * @return
     */
    ResponseEntity<?> export();
}
