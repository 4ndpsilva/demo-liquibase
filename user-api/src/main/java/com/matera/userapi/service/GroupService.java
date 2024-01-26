package com.matera.userapi.service;

import com.matera.userapi.domain.Group;
import com.matera.userapi.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository repository;

    public Group save(Group group){
        return repository.save(group);
    }

    public Group findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grupo Não encontrado"));
    }

    public List<Group> list(){
        return repository.findAll();
    }
}