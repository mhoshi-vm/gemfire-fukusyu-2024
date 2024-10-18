package com.example.gemfirefukusyu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class DemoController {

    DemoRepository demoRepository;

    Integer count;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
        this.count = 0;
    }

    @GetMapping
    List<DemoRecord> getter(){
      return demoRepository.findAll()
              .stream()
              .map(DemoRecordExtend::demoRecord).toList();
    }

    @PostMapping
    void poster(@RequestParam String demoValue){
        DemoRecord demoRecord = new DemoRecord(count.toString(), demoValue);
        demoRepository.save(new DemoRecordExtend(count.toString(),demoRecord));
        count++;
    }

    @GetMapping("/sort")
    List<DemoRecord> sorter(@RequestParam(defaultValue = "100") Integer limit){
        return demoRepository.listDemoRecordOrderByDemoValue(limit).stream().map(DemoRecordExtend::demoRecord).toList();
    }
}
