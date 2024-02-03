package com.example.samuraitravel.form;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class ReviewsForm {
	@NotNull
	private Integer id;
	
	@NotNull(message = "評価を入力してください。")
	@Size(min = 0, max = 5)
	private Integer score;
	
	@NotBlank(message = "コメントを入力してください。")
	private String comment;
}
