package com.example.demosoap.service;

import com.provider.uws.GetInformationArguments;
import com.provider.uws.GetInformationResult;
import com.provider.uws.ObjectFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Slf4j
@Endpoint
public class ProvidersServiceEndpoint {

    private static final String NAMESPACE_URI = "http://uws.provider.com/";
    private final ObjectFactory factory = new ObjectFactory();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetInformationArguments")
    @ResponsePayload
    public GetInformationResult getInformation(@RequestPayload GetInformationArguments request) {
        GetInformationResult result = factory.createGetInformationResult();
        log.info("GetInformationArguments method called");
        return result;
    }
}