package com.rap.config.exception;

import com.rap.support.messages.PreparedMessages;
import lombok.Getter;

public class ValidIdException extends Exception {

    @Getter
    private PreparedMessages preparedMessages;

    public ValidIdException(PreparedMessages message) {
        this.preparedMessages = message;
    }
}
