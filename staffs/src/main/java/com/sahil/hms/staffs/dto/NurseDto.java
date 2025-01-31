package com.sahil.hms.staffs.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NurseDto extends UserDto{
    @NotNull
    @NotEmpty
    private String shift;
    @NotNull
    @NotEmpty
    private String ward;

    private List<CertificationDto> certificationDtos;
}
