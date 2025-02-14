package com.alkemy.ong.ports.input.rs.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAlkymerRequest {

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    @JsonProperty("start_date")
    private Date startDate;

    @DateTimeFormat(
            iso = ISO.DATE_TIME
    )
    @JsonProperty("end_date")
    private Date endDate;

    @Valid
    @JsonProperty("skills")
    private List<SkillRequest> skills;
}
