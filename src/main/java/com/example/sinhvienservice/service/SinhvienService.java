package com.example.sinhvienservice.service;

import com.example.sinhvienservice.VO.Khoa;
import com.example.sinhvienservice.VO.ResponseTemplateVO;
import com.example.sinhvienservice.entity.Sinhvien;
import com.example.sinhvienservice.repository.SinhvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SinhvienService {
    @Autowired
    private SinhvienRepository sinhvienRepository;
    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplateVO findById(int id){
        Sinhvien sv= sinhvienRepository.findById(id).get();
        Khoa khoa= restTemplate.getForObject("khoa/"+sv.getKhoaId(), Khoa.class);
        System.out.println("kk"+ khoa);
        return  new ResponseTemplateVO(sv,khoa);
    }
    public Sinhvien saveSV(Sinhvien sinhvien){
        return sinhvienRepository.save(sinhvien);
    }

}
