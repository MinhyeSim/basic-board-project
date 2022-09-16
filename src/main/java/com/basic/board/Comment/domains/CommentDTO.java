package com.basic.board.Comment.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component @Data
public class CommentDTO {
    @ApiModelProperty(position = 1) private long commentId;
    @ApiModelProperty(position = 2) String comment;
    @ApiModelProperty(position = 3) String createdDate;
    @ApiModelProperty(position = 4) String modifiedDate;
    @ApiModelProperty(position = 5) int view;
}
