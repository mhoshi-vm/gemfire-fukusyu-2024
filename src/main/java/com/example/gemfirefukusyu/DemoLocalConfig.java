package com.example.gemfirefukusyu;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@Configuration
@Con
@EnableEntityDefinedRegions(basePackageClasses = DemoRecord.class, clientRegionShortcut = ClientRegionShortcut.LOCAL)
class DemoConfig {
}
