package com.deecodeme.poc.java.blocking.api.latent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DownstreamDummyService implements DownstreamDummyApi{
    private final DownstreamDummyFeignClient downstreamDummyFeignClient;
    @Override
    public String getDummyData() {
        return "Got data from downstream: " + downstreamDummyFeignClient.getDummyData();
    }
}
