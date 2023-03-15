package org.riccskn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/images")
public class ImageController {

    @Autowired
    ResourceLoader resourceLoader;


    @GetMapping("logo")
    public ResponseEntity<Resource> getLogoImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/logo.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("main-background")
    public ResponseEntity<Resource> getMainBackgroundImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/main-background.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("about-background")
    public ResponseEntity<Resource> getAboutBackgroundImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/about-background.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("author")
    public ResponseEntity<Resource> getAuthorImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/author.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("first-material-image")
    public ResponseEntity<Resource> getFirstMaterialImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/first-material.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("main-material-image")
    public ResponseEntity<Resource> getMainMaterialImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/main-material-image.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("second-material-image")
    public ResponseEntity<Resource> getSecondMaterialImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/second-material.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

    @GetMapping("service-background")
    public ResponseEntity<Resource> getServiceBackgroundImage() {
        Resource resource = resourceLoader.getResource("classpath:/static/images/service-background.png");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }

}
