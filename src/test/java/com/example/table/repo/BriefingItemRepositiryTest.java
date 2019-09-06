package com.example.table.repo;

import com.example.table.model.BriefingItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BriefingItemRepositiryTest {
    @Autowired
    private BriefingItemRepositiry briefingItemRepositiry;

    @Test
    public void testSave() {

        BriefingItem item = new BriefingItem();
        item.setTitle("one");
        item.setContent("test0");
        item.setCategory(0);

        briefingItemRepositiry.save(item);

        BriefingItem item1 = new BriefingItem();
        item1.setTitle("second");
        item1.setContent("test1");
        item1.setCategory(1);

        briefingItemRepositiry.save(item1);
    }

    //想要测试通过需要将表的级联策略改为 fetch=FetchType.EAGER
    @Test
    public void testQuery(){
        List<BriefingItem> items = briefingItemRepositiry.findAll();
        for(BriefingItem item : items ){
            System.out.println("MyTest:" + item.toString());
        }
    }

    @Test
    public void testDelete(){
        briefingItemRepositiry.deleteById(1);
    }

    @Test
    public void testUpdate(){
        BriefingItem item = briefingItemRepositiry.findById(2).get();
        item.setTitle("update1");
        item.setContent("update1");
        briefingItemRepositiry.saveAndFlush(item);
    }
}