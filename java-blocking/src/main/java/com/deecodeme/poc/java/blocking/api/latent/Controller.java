package com.deecodeme.poc.java.blocking.api.latent;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final DownstreamDummyApi downstreamDummyApi;
    @GetMapping("/call-dummy")
    public String callDummy(){
        return downstreamDummyApi.getDummyData().toString();
    }
}
