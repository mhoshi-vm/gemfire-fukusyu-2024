package com.example.gemfirefukusyu;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("demo")
record DemoRecord(
        @Id
        String demoId,
        String demoValue
) {
}
