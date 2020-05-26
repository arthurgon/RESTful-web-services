package com.telefonica.api.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.api.dtos.CompanyDto;
import com.telefonica.api.responses.Response;

@RestController
@RequestMapping("/api/companies")
public class ControllerCompany {

	@PostMapping
	public ResponseEntity<Response<CompanyDto>> cadastrar(@Valid @RequestBody CompanyDto companyDto,
			BindingResult result) {
		Response<CompanyDto> response = new Response<CompanyDto>();

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		companyDto.setId(1L);
		response.setData(companyDto);
		
		return ResponseEntity.ok(response);
	}
}
