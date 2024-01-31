package com.research.chat.domain.ai.spark.endPoint.images.resp;

import com.research.chat.domain.ai.spark.endPoint.images.ImageHeader;
import com.research.chat.domain.ai.spark.endPoint.images.ImagePayload;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageCreateResponse {

    @JsonProperty("header")
    private ImageHeader imageHeader;

    @JsonProperty("payload")
    private ImagePayload imagePayload;
}
