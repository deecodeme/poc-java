package com.deecodeme.poc.java.non.blocking.api.latent;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final DownstreamDummyApi downstreamDummyApi;

    @GetMapping("/call-dummy-non-blocking")
    public Mono<String> callDummy() {
        return downstreamDummyApi.getDummyData().flatMap(dummyData -> Mono.just("Result after non blocking call: " + dummyData));
    }
}
