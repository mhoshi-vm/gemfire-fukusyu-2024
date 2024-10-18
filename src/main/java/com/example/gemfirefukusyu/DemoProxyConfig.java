package com.example.gemfirefukusyu;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@Configuration
@ConditionalOnProperty(value = "localregion", havingValue = "false")
@EnableEntityDefinedRegions(basePackageClasses = DemoRecordExtend.class)
class DemoProxyConfig {
}
