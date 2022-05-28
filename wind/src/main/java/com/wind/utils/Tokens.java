package com.wind.utils;

import com.wind.entity.Manager;
import com.wind.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.util.Base64Utils;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

public class Tokens {
    private static final Key KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    /**
     * 生成用户token令牌
     * @param user 用户
     * @return token令牌
     */
    public static String createToken(User user) {
        String id = Base64Utils.encodeToString(user.getuId().toString().getBytes());// 加密id
        return Jwts.builder()
                .claim("uName", user.getuName()) // name
                .setId(id)// 加密id
                .setIssuedAt(new Date(System.currentTimeMillis()))// current time 生效时间
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))// expiration time 过期时间 ms
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    public static String createToken(Manager manager) {
        String id = Base64Utils.encodeToString(manager.getmId().toString().getBytes());// 加密id
        return Jwts.builder()
                .claim("mAccount", manager.getmAccount()) // name
                .setId(id)// 加密id
                .setIssuedAt(new Date(System.currentTimeMillis()))// current time 生效时间
                .setExpiration(new Date(System.currentTimeMillis() + 300 * 1000))// expiration time 过期时间 ms
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    /**
     * 解析Token 转换成Claims类
     *
     * @param token token
     * @return Claims
     */
    public static Claims parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * 从token中获取uName
     *
     * @param token token
     * @return return
     */
    public static String getUserId(String token) {
        try {
            Claims claims = parseToken(token);
            String id = claims.getId();
            byte[] bytes = Base64Utils.decodeFromString(id);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从token中获取uName
     *
     * @param token token
     * @return return
     */
    public static String getUserName(String token) {
        Claims claims = parseToken(token);
        return claims.get("uName", String.class);
    }

    /**
     * 判断token是否过期
     *
     * @param token token
     * @return return
     */
    public static boolean isExpiration(String token) {
        try {
            Date timestamp = parseToken(token).getExpiration();
            return timestamp.before(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /**
     * 超时、不匹配 返回false
     * @param token token
     * @param id id
     * @return return
     */
    public static boolean isMatched(String token, Integer id){
        if (isExpiration(token)){
            return false;
        }
        return Integer.toString(id).equals(getUserId(token));
    }
}
