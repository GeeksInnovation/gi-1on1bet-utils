package com._on1betutils.utils1on1bet;

public class _on1BetResponseBuilder {

    public <T> _on1BetResponse<T> buildSuccessResponse(T data) {
        return new _on1BetResponse<>(true, null, data);
    }

    public <T> _on1BetResponse<T> buildFailureResponse(String message) {
        return new _on1BetResponse<>(false, message, null);
    }
    
}
