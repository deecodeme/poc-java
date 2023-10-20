package com.deecodeme.poc.java.blocking.api.latent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "downstream-dummy", url = "http://localhost:8080")
public interface DownstreamDummyFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/dummy", produces = "application/json")
    String getDummyData();
}
