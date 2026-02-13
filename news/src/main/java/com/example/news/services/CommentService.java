package com.example.news.services;

import com.example.news.models.Comment;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CommentService {
    private final List<Comment> comments = new ArrayList<>();
    private final AtomicInteger commentIdCounter = new AtomicInteger(1);

    public List<Comment> getCommentsByNewsId(int newsId) {
        return comments.stream()
                .filter(comment -> comment.getNewsId() == newsId)
                .toList();
    }

    public void addComment(int newsId, String userId, String userName, String text) {
        String date = java.time.LocalDate.now().toString();
        Comment comment = new Comment(
                commentIdCounter.getAndIncrement(),
                newsId,
                userId,
                userName,
                text,
                date
        );
        comments.add(comment);
    }
}
