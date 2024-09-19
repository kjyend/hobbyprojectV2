package com.hobbyproject.service;

import com.hobbyproject.dto.comment.request.CreatedComment;
import com.hobbyproject.dto.comment.response.CommentResponseDto;

import java.util.List;

public interface CommentService {
    void commentCreate(CreatedComment createdComment, Long postId, String loginId);

    void deleteComment(Long commentId);

    List<CommentResponseDto> getList(Long postId);

    boolean isCommentOwner(Long commentId, String loginId);
}
