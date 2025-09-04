package by.nurbolat.weatherappv1.dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UserDto {
    String username;
    LocalDate birthdate;
    String login;
    String pwd;
}
