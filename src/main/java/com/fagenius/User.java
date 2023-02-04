package com.fagenius;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {
    private int id;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
}
