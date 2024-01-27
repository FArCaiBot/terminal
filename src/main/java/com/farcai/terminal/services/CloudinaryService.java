package com.farcai.terminal.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CloudinaryService {
    String uploadFile(MultipartFile file) throws IOException;

    String changeFile(MultipartFile file, String oldFile);
}
