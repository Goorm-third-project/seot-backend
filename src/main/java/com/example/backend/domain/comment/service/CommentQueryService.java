package com.example.backend.domain.comment.service;

import com.example.backend.domain.comment.dto.CommentResponse;
import com.example.backend.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentQueryService {
    private final CommentRepository commentRepository;

    public Page<CommentResponse> getComments(Long postId, Pageable pageable) {
        return commentRepository.findAllByPostIdOrderByIdDesc(postId, pageable)
                .map(CommentResponse::from);
    }
}
