package com.example.gemfirefukusyu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class DemoController {

    DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping
    List<DemoRecord> getter(){
      return demoRepository.findAll();
    }

    @PostMapping
    void poster(@RequestParam String demoValue){
        demoRepository.save(new DemoRecord("1", demoValue));
    }

}
