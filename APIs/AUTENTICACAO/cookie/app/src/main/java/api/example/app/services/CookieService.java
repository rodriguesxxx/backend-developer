package api.example.app.services;

import java.util.Optional;
import java.util.Arrays;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieService {

    public static String getCookie(HttpServletRequest request, String key) {
        return Optional.ofNullable(request.getCookies())
                .flatMap(cookies -> Arrays.stream(cookies)
                .filter(cookie -> key.equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
            )
            .orElse(null);

    }

    public static void setCookie(HttpServletResponse response,String key, String value){
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

}
