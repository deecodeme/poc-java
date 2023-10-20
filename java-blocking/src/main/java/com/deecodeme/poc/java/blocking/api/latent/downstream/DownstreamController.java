package com.deecodeme.poc.java.blocking.api.latent.downstream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DownstreamController {
    @GetMapping("/dummy")
    public String getDummyData() throws InterruptedException {
        Thread.sleep(10000);
        return "Slept well";
    }
}
