package com.example.onlyairmensearchserver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserTest {

    @Test
    public void getUsername() {
        User user = new User();
        String username = user.getUsername();

        assertNull(username);
    }
}
