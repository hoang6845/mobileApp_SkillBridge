package com._NguoiDev.SkillBridge.dto.response;

import com._NguoiDev.SkillBridge.controller.InformationResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {
    private String token;
    private boolean authenticated;
    private InformationResponse info;
}
