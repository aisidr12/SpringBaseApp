package com.pruebaspring.jwt.securityspring.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.pruebaspring.jwt.securityspring.dto.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
public class JwtAuthenticationProvider {

    private static final String secretKey= "SECRET";
    private Map<String, CustomerDto> availableTokens = new ConcurrentHashMap<>();


    private String createToken(CustomerDto customerJwt){
        Date now = new Date();
        Date validity = new Date(now.getTime() + 3600000); // 1 hour
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        String tokenCreated = JWT.create()
                .withClaim("fullname", customerJwt.fullName())
                .withClaim("numberCellPhone", String.valueOf(customerJwt.numeroMovil()))
                .withClaim("email", customerJwt.email())
                .withIssuedAt(now)
                .withExpiresAt(validity)
                .sign(algorithm);

        availableTokens.put(tokenCreated,customerJwt);
        return  tokenCreated;
    }

    public String DeleteToken(String jwt){
        if(availableTokens.containsKey(jwt)){
                return "No token found";
        }
        availableTokens.remove(jwt);
        return "Session Closed";
    }
}
