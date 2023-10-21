package com.deecodeme.poc.java.non.blocking.api.latent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DownstreamDummyService implements DownstreamDummyApi{
    private WebClient webClient;

    public DownstreamDummyService(@Value("${baseurl.java_blocking}") String hostname,
                                  WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(hostname).build();
    }

    @Override
    public Mono<String> getDummyData() {
        return webClient.get().uri("/dummy").retrieve().bodyToMono(String.class);
    }
}
