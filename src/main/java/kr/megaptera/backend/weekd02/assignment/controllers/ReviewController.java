package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/{productId}/review")
public class ReviewController {
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public String create(@PathVariable String productId, @RequestBody String reviewDto, @RequestAttribute String userId) {
		return "상품에 리뷰 작성: " + reviewDto + "\n";
	}

	@PatchMapping("/{id}")
	public String update(@PathVariable String productId, @PathVariable String id, @RequestBody String reviewDto, @RequestAttribute String userId) {
		return "상품에 리뷰 수정: " + id + "\n";
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable String productId, @PathVariable String id, @RequestAttribute String userId) {
		return "상품에 리뷰 삭제: " + id + "\n";
	}

}
