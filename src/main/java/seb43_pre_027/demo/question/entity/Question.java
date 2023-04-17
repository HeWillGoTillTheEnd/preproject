package seb43_pre_027.demo.question.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import seb43_pre_027.demo.audit.Auditable;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Question extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String body;

    @Column
    private int likeCount;

    public enum QuestionStatus {}
}
