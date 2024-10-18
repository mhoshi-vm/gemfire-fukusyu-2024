package com.example.gemfirefukusyu;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@Configuration
@ConditionalOnProperty(value = "localregion", havingValue = "true", matchIfMissing = true)
@EnableEntityDefinedRegions(basePackageClasses = DemoRecordExtend.class, clientRegionShortcut = ClientRegionShortcut.LOCAL)
class DemoLocalConfig {
}
