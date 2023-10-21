package com.deecodeme.poc.java.non.blocking.api.latent;

import reactor.core.publisher.Mono;

public interface DownstreamDummyApi {
    Mono<String> getDummyData();
}
