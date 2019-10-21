package com.jianyuan.cmchannel.service;

import com.jianyuan.cmchannel.FastDFSClient;
import com.jianyuan.cmchannel.exception.ChannelException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class AdmittanceService {
    @Autowired
    private final FastDFSClient fastDFSClient;

    public AdmittanceService(FastDFSClient fastDFSClient) {
        this.fastDFSClient = fastDFSClient;
    }
    public String uploadMaterial( MultipartFile file)  {
        try {
            return fastDFSClient.uploadFile(file);
        } catch (IOException e) {
            throw new ChannelException("渠道内部错误");
        }
    }
}
