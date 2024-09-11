package com.hobbyproject.service;

import com.hobbyproject.dto.post.request.PostEditDto;
import com.hobbyproject.dto.post.request.PostSearchDto;
import com.hobbyproject.dto.post.request.PostWriteDto;
import com.hobbyproject.dto.post.response.PostResponseDto;
import com.hobbyproject.entity.Member;
import com.hobbyproject.entity.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {


    void postCreate(PostWriteDto postWriteDto, Member member,List<MultipartFile> images);

    boolean postEdit(PostEditDto postEditDto, Member member);

    boolean postDelete(Long postId, Member member);

    List<Post> findPosts();

    Post findPost(Long postId);

    boolean postMemberCheck(Post post, Member member);

    List<PostResponseDto> getList(PostSearchDto postSearch);
}
