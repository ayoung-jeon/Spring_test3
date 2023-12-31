package com.sparta.springauth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("수동 등록한 passwordEncoder를 주입 받아와 문자열 암호화")
    void test1() {
        String password = "Robbie's password";

        // 암호화
        String encodePassword = passwordEncoder.encode(password); // ()안에 암호화할 것을 넣어줌
        System.out.println("encodePassword = " + encodePassword); // 진짜 암호화 되는지 확인하기 위한 것

        String inputPassword = "Robbie";

        // 복호화를 통해 암호화된 비밀번호와 비교: matches 라는 메서드가 해주고있음
        boolean matches = passwordEncoder.matches(inputPassword, encodePassword); // (입력받은 문자열, 암호화한 상태값)
        System.out.println("matches = " + matches); // 암호화할 때 사용된 값과 다른 문자열과 비교했기 때문에 false
    }
}