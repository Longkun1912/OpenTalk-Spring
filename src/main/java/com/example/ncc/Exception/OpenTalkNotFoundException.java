package com.example.ncc.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class OpenTalkNotFoundException  extends RestClientException {
    public OpenTalkNotFoundException(String message){
        super(message);
    }
}
