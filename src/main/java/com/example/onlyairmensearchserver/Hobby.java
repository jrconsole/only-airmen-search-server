package com.example.onlyairmensearchserver;

import javax.persistence.*;

@Entity
@Table(name = "hobbies")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hobby_id;
    private String name;

    public Long getHobby_id_id() {
        return hobby_id;
    }

    public void setHobby_id(Long hobby_id) {
        this.hobby_id = hobby_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}