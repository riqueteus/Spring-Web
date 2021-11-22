package com.example.springbootweb.service.Autenticacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.springbootweb.service.CookieService;
import org.springframework.web.servlet.HandlerInterceptor;

import org.springframework.stereotype.Component;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    
   @Override
   public boolean preHandle
      (HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {

        try{
            if(CookieService.getCookie(request, "usuarioId") != null){
               return true;
            }
         }
         catch(Exception erro) {}

      response.sendRedirect("/login");
      return false;
   }
}
