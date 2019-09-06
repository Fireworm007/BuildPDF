package com.example.table.repo;

import com.example.table.model.BriefingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefingItemRepositiry extends JpaRepository<BriefingItem, Integer> {
    void deleteById(int id);


}
