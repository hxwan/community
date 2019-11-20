package edu.shu.community.dto;

public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redrect_uri;
    private String state;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedrect_uri() {
        return redrect_uri;
    }

    public void setRedrect_uri(String redrect_uri) {
        this.redrect_uri = redrect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
