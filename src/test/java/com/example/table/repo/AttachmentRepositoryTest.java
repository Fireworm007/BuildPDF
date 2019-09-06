package com.example.table.repo;

import com.example.table.model.Attachment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttachmentRepositoryTest {
    @Autowired
    private AttachmentRepository attachmentRepository;

    @Test
    public void testSave(){
        Date date = new Date();
        Attachment attachment = new Attachment(date);
        attachment.setFileName("test");
        attachment.setFileType(0);
        attachment.setBriefingItemId(2);

        attachmentRepository.save(attachment);
    }
}