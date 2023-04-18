package seb43_pre_027.demo.question.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

public class QuestionDto {

    @Getter
    @AllArgsConstructor
    public static class Post {
        @NotBlank(message = "제목은 공백이 아니어야 합니다.")
        private String title;

        @NotBlank(message = "질문 내용은 공백이 아니어야 합니다.")
        private String body;
    }

    @Getter
    @AllArgsConstructor
    public static class Patch {
        private long questionId;

        @NotBlank(message = "제목은 공백이 아니어야 합니다.")
        private String title;

        @NotBlank(message = "질문 내용은 공백이 아니어야 합니다.")
        private String body;

        public void setQuestionId(long questionId) {
            this.questionId = questionId;
        }
    }

    @Getter
    public static class Response {
        private long questionId;
        private String title;
        private String body;
        private int likeCount;

        public Response(long questionId, String title, String body, int likeCount) {
            this.questionId = questionId;
            this.title = title;
            this.body = body;
            this.likeCount = likeCount;
        }
    }
}
