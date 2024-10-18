package com.example.gemfirefukusyu;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


interface DemoRepository extends ListCrudRepository<DemoRecordExtend, String> {
    @Query("select * from /demo2 order by demoRecord.demoValue limit $1")
    List<DemoRecordExtend> listDemoRecordOrderByDemoValue(Integer limit);
}
