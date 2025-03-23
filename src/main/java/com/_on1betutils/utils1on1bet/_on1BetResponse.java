package com._on1betutils.utils1on1bet;

public class _on1BetResponse<T> {

    private Boolean serviceStatus;
    private String serviceMessage;
    private T data;

    public _on1BetResponse(Boolean serviceStatus, String serviceMessage, T data) {
        this.serviceStatus = serviceStatus;
        this.serviceMessage = serviceMessage;
        this.data = data;
    }

    public Boolean getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Boolean serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceMessage() {
        return serviceMessage;
    }

    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
