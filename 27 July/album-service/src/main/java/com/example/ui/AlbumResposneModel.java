package com.example.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlbumResposneModel {
	
	private String albumId;
	private String userId;
	private String name;
	private String description;
}
