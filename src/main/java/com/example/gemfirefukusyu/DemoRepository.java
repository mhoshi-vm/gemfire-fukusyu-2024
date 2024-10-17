package com.example.gemfirefukusyu;

import org.springframework.data.repository.ListCrudRepository;


interface DemoRepository extends ListCrudRepository<DemoRecord, String> {
}
