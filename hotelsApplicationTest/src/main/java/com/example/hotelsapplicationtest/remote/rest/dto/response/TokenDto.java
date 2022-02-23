package com.example.hotelsapplicationtest.remote.rest.dto.response;

public class TokenDto<String>
{
    private String token;

    public TokenDto()
    {

    }

    public TokenDto(String token)
    {
        this.token = token;
    }

    public String getToken()
    {
        return token;
    }
    public void setToken(String token)
    {
        this.token = token;
    }
}
