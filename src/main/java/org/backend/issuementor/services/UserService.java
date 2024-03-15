package org.backend.issuementor.services;

import org.backend.issuementor.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    User saveEncoded(User user);
    User saveUnencoded(User user);
}