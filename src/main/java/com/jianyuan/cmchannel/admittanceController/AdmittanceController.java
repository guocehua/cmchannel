package com.jianyuan.cmchannel.admittanceController;


import com.jianyuan.cmchannel.service.AdmittanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/*
* 入网相关的接口
*
*
* */
@RestController
@RequestMapping("/admittance")
public class AdmittanceController {
    @Autowired
    private final AdmittanceService admittanceService;

    public AdmittanceController(AdmittanceService admittanceService) {
        this.admittanceService = admittanceService;
    }
    @PostMapping("/upload")
    public String uploadMaterial(@RequestParam MultipartFile file) throws IOException {
        return admittanceService.uploadMaterial(file);
    }
}
