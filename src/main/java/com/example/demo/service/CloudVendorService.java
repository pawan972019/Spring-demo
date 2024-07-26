package com.example.demo.service;

import com.example.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendor();
    public String deleteCloudVendor(String vendorId);
}
