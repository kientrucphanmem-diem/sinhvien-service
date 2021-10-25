package com.example.sinhvienservice.controller;

import com.example.sinhvienservice.VO.ResponseTemplateVO;
import com.example.sinhvienservice.entity.Sinhvien;
import com.example.sinhvienservice.service.SinhvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sv")
public class SinhvienController {
    @Autowired
    private SinhvienService sinhvienService;

    @GetMapping("/{id}")
    public ResponseTemplateVO getSVByid(@PathVariable int id){
        return sinhvienService.findById(id);
    }
    @PostMapping("/")
    public Sinhvien saveSV(@RequestBody Sinhvien sinhvien){
        return sinhvienService.saveSV(sinhvien);
    }
}
