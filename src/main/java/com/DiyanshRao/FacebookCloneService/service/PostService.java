package com.DiyanshRao.FacebookCloneService.service;

import com.DiyanshRao.FacebookCloneService.model.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}