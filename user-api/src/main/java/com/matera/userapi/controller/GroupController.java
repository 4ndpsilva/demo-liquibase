package com.matera.userapi.controller;

import com.matera.userapi.domain.Group;
import com.matera.userapi.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService service;

    @PostMapping
    public ResponseEntity<Group> save(@RequestBody Group group){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(group));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Group>> list(){
        return ResponseEntity.ok(service.list());
    }
}