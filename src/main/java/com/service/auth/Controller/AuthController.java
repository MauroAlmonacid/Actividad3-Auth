package com.service.auth.Controller;

import java.security.Key;
import java.nio.charset.StandardCharsets;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/auth")

public class AuthController {
    @Value("${jwt.secret}")
    private String secretString;
    private Key getSigningKey() {
        // Convierte el texto plano de la variable de entorno en una llave criptográfica segura para HS256
        return Keys.hmacShaKeyFor(secretString.getBytes(StandardCharsets.UTF_8));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO request){
        -
    }
}
