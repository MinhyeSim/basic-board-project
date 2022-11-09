package com.basic.board.study.Post.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class PostDTO {
    @ApiModelProperty(position = 1) private long postId;
    @ApiModelProperty(position = 2) String title;
    @ApiModelProperty(position = 3) String content;
    @ApiModelProperty(position = 4) String writer;
    @ApiModelProperty(position = 5) int view;
}
