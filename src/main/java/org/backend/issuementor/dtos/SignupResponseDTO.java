package org.backend.issuementor.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {
    private long id;
    private String username;
    private String email;
}