package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Category;
import ch.zli.m223.punchclock.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/categories")
public class CategoryController {
    //call of the class CategoryService
    private CategoryService categoryService;

    //Initialization of the CategoryService
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    //Function for finding all existing Categories
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    //Function for creating new Categories
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@Valid @RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    //Function to delete a Category over its id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable long id) {
        categoryService.deleteCategory(id);
    }

    //Function to update a Category over its id
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category updateCategory(@Valid @RequestBody Category category, @PathVariable String id) {
        return categoryService.updateCategory(category);
    }

}
