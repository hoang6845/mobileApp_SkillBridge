package com._NguoiDev.SkillBridge.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionResponse {
    private String id;
    private LocalDateTime submissionTime;
    private List<String> filesNames;
    private int status;
    private String submissionBy;
    private int point;
    private String feedback;
}
