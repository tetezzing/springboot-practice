package com.config.auth.dto;

import com.domain.user.User;
import lombok.Getter;

import java.io.Serializable;
// 인증된 사용자의 정보만 필요
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
