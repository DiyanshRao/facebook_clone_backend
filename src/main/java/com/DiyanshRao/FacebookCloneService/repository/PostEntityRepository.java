package com.DiyanshRao.FacebookCloneService.repository;

import com.DiyanshRao.FacebookCloneService.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity,String> {

}
