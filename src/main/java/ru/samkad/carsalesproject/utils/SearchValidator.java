package ru.samkad.carsalesproject.utils;


import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.samkad.carsalesproject.dto.PostSearchDto;

@Controller
public class SearchValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return PostSearchDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PostSearchDto dto = (PostSearchDto) target;
        if (dto.getCar() == null) {
            errors.rejectValue("car", "Car is null");
        }
        if (dto.getHighestPrice() <= 0) {
            errors.rejectValue("highestPrice", "highest price is less than 1");
        }
        if (dto.getLowestPrice() <= 0) {
            errors.rejectValue("lowestPrice", "lowest price is less than 1");
        }
        if (dto.getPostCreatedBeforeDays() <= 0) {
            errors.rejectValue("postCreatedBeforeDays", "created before is less than 1");
        }
        if (!dto.isImageExists()) {
            errors.rejectValue("imageExists", " only image exists is false");
        }
    }
}
