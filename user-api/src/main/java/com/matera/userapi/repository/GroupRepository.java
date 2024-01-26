package com.matera.userapi.repository;

import com.matera.userapi.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> { }