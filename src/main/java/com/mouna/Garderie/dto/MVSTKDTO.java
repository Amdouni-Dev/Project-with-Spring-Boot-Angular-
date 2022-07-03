package com.mouna.Garderie.dto;

import com.mouna.Garderie.models.Article;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MVSTKDTO {
    private Integer id;
    private ArticleDTO  article;
}
