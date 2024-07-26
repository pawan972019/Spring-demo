package com.example.demo.controller;


import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    private final CloudVendorService cloudVendorService;


    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendor(){

        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody  CloudVendor cloudVendor){

        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody  CloudVendor cloudVendor){

        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.deleteCloudVendor(vendorId);
    }
}
