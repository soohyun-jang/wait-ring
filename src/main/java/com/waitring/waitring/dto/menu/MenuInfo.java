package com.waitring.waitring.dto.menu;

import com.waitring.waitring.entity.Store;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Schema(description = "메뉴 정보")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuInfo {

    @Schema(description = "메뉴Id")
    @NotNull
    private Long id;

    @Schema(description = "메뉴명")
    @NotBlank
    private String name;

    @Schema(description = "메뉴 가격")
    @NotNull
    private Integer price;

    @Schema(description = "메뉴 설명")
    @NotBlank
    private String detail;

    @Schema(description = "메뉴 이미지")
    @NotBlank
    private String image;
}
