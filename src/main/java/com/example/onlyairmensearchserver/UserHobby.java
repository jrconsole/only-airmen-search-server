package com.example.onlyairmensearchserver;

import javax.persistence.*;

@Entity
@Table(name = "user_hobbies")
public class UserHobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hobby_id;
    private Long user_id;

    public Long getHobby_id() {
        return hobby_id;
    }

    public void setHobby_id(Long hobby_id) {
        this.hobby_id = hobby_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setuser_id(Long user_id) {
        this.user_id = user_id;
    }

}