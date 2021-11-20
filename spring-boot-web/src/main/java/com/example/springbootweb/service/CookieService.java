package com.example.springbootweb.service;

import javax.servlet.http.HttpServletResponse;

import java.util.Arrays;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieService {  // gravar o cookie 
    public static void setCookie(HttpServletResponse response, String key, String valor, int segundos){
        Cookie cookie = new Cookie(key , valor);
        cookie.setMaxAge(segundos); // tempo que o cookie vai durar
        response.addCookie(cookie);
    } 

    public static String getCookie(HttpServletRequest request, String key){// ler o cookie
        return Optional.ofNullable(request.getCookies())
        .flatMap(cookies -> Arrays.stream(cookies)
        .filter(cookie -> key.equals(cookie.getName()))
        .findAny()
        ).map(e -> e.getValue())
    .orElse(null);
    
    }
}
