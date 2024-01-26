package com.matera.userapi.service;

import com.matera.userapi.domain.User;
import com.matera.userapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User save(User user){
        return repository.save(user);
    }

    public User findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário Não encontrado"));
    }

    public List<User> list(){
        return repository.findAll();
    }
}