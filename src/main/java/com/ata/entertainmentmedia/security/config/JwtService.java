package com.ata.entertainmentmedia.security.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    //HS256(HMAC with SHA256) BASE64 digit HEX version OF 256bit
    //move it to application.yml?>
    private static final String SECRET_KEY = "facc5077f217c71a8cf0275bc90ad2db59f2ba59a334f12e40a3150b827e3472";

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // written as, because the above extractClaim() takes in the signature below
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {

        final Claims claims = extractAllClaims(token);

        return claimsResolver.apply(claims);
    }

    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }

    //same as above but with claims
    public String generateToken(
            Map<String, Object> extraClaims, UserDetails userDetails
    ) {

        return  Jwts.builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000)) // valid for 24 hours by standard
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();

    }
    
    public boolean isTokenValid(String token, UserDetails userDetails) {
        
        final String username = extractUsername(token);
        
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {

        return exractExpiration(token).before(new Date());
    }

    private Date exractExpiration(String token) {

        return  extractClaim(token, Claims::getExpiration);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {

        byte[]  keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
