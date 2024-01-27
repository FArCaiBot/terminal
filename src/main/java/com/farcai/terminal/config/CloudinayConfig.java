package com.farcai.terminal.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinayConfig {
    private final String CLOUD_NAME = "dcpx2vfb2";
    private final String API_KEY = "157569199252822";
    private final String API_SECRET = "qv2FDVSsV41EXKwj45Hq52eAShU";

    @Bean
    public Cloudinary cloudinary(){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);
        return new Cloudinary(config);
    }
}
