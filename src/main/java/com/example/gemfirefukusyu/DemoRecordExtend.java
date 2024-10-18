package com.example.gemfirefukusyu;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("demo2")
record DemoRecordExtend (
        @Id String id,
        DemoRecord demoRecord
){}
