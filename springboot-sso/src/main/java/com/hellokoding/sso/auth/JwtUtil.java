package com.hellokoding.sso.auth;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class JwtUtil {
    private static final String REDIS_SET_ACTIVE_SUBJECTS = "active-subjects";

    public static String generateToken(String signingKey, String subject) {
    		//  redis 里缓存的是set 集合 
    	    RedisUtil.INSTANCE.sadd(REDIS_SET_ACTIVE_SUBJECTS, subject);
    	   
    	    // 设置token
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        JwtBuilder builder = Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(now)
                .signWith(SignatureAlgorithm.HS256, signingKey);

        String token = builder.compact();

       

        return token;
    }

//    public static String parseToken(HttpServletRequest httpServletRequest, String jwtTokenCookieName, String signingKey){
//        String token = CookieUtil.getValue(httpServletRequest, jwtTokenCookieName);
//        if(token == null) {
//            return null;
//        }
//
//        String subject = Jwts.parser().setSigningKey(signingKey).parseClaimsJws(token).getBody().getSubject();
//        if (!RedisUtil.INSTANCE.sismember(REDIS_SET_ACTIVE_SUBJECTS, subject)) {
//            return null;
//        }
//
//        return subject;
//    }

//    public static void invalidateRelatedTokens(HttpServletRequest httpServletRequest) {
//        RedisUtil.INSTANCE.srem(REDIS_SET_ACTIVE_SUBJECTS, (String) httpServletRequest.getAttribute("username"));
//    }
}

