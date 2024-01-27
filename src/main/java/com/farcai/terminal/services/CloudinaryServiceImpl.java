package com.farcai.terminal.services;

import com.cloudinary.Cloudinary;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CloudinaryServiceImpl implements CloudinaryService {

    private final Cloudinary cloudinary;

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return "";
        }
        return cloudinary.uploader()
                .upload(file.getBytes(),
                        Map.of("folder", "terminal",
                                "resource_type", "image"))
                .get("url").toString();
    }

    @Override
    public String changeFile(MultipartFile file, String oldFile) {
        if (file==null) {
            return oldFile;
        }
        String newFile = "";
        try {
            newFile = uploadFile(file);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        //TODO: eliminar foto antigua
        try {
            cloudinary.api().deleteResources(Collections.singletonList(getPathImage(oldFile)),
                    Map.of("type", "upload",
                            "resource_type", "image"));
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return newFile;
    }

    public String getPathImage(String urlImage) {
        return "terminal/" + urlImage.substring(urlImage.lastIndexOf("/") + 1,
                urlImage.lastIndexOf("."));
    }
}
