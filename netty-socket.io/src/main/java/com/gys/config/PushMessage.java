package com.gys.config;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PushMessage {

    private Integer loginUserNum;

    private String content;

    // Other Detail Property...
}