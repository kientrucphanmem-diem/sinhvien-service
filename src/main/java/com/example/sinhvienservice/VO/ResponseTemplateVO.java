package com.example.sinhvienservice.VO;

import com.example.sinhvienservice.entity.Sinhvien;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Sinhvien sinhvien;
    private Khoa khoa;
}
