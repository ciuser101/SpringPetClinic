package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.Test;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Michael Isvy
 *         Simple test to make sure that Bean Validation is working
 *         (useful when upgrading to a new version of Hibernate Validator/ Bean Validation)
 */
public class ValidatorTests {
	
	

    private Validator createValidator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.afterPropertiesSet();
        return localValidatorFactoryBean;
    }

    @Test
    public void shouldNotValidateWhenFirstNameEmpty() {
    	
        LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertThat(constraintViolations.size()).isEqualTo(1);
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
        assertThat(violation.getMessage()).isEqualTo("may not be empty");
    }
    
    @Test
	public void testShouldNotValidateWhenFirstNameEmpty() {
    	LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertThat(constraintViolations.size()).isEqualTo(1);
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
        assertThat(violation.getMessage()).isEqualTo("may not be empty");
	}
    
    @Test
	public void testShouldNotValidateWhenFirstNameEmpty1() {
    	LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertThat(constraintViolations.size()).isEqualTo(1);
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
        assertThat(violation.getMessage()).isEqualTo("may not be empty");
	}
    
    @Test
	public void testShouldNotValidateWhenFirstNameEmpty2() {
    	LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertThat(constraintViolations.size()).isEqualTo(1);
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
        assertThat(violation.getMessage()).isEqualTo("may not be empty");
	}
    
    @Test
	public void testShouldNotValidateWhenFirstNameEmpty21() {
    	LocaleContextHolder.setLocale(Locale.ENGLISH);
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("smith");

        Validator validator = createValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        assertThat(constraintViolations.size()).isEqualTo(1);
        ConstraintViolation<Person> violation = constraintViolations.iterator().next();
        assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
        assertThat(violation.getMessage()).isEqualTo("may not be empty");
	}
    
    
    @Test
   	public void testShouldNotValidateWhenFirstNameEmpty22() {
       	LocaleContextHolder.setLocale(Locale.ENGLISH);
           Person person = new Person();
           person.setFirstName("");
           person.setLastName("smith");

           Validator validator = createValidator();
           Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

           assertThat(constraintViolations.size()).isEqualTo(1);
           ConstraintViolation<Person> violation = constraintViolations.iterator().next();
           assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
           assertThat(violation.getMessage()).isEqualTo("may not be empty");
   	}
    
    
    @Test
   	public void testShouldNotValidateWhenFirstNameEmpty23() {
       	LocaleContextHolder.setLocale(Locale.ENGLISH);
           Person person = new Person();
           person.setFirstName("");
           person.setLastName("smith");

           Validator validator = createValidator();
           Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

           assertThat(constraintViolations.size()).isEqualTo(1);
           ConstraintViolation<Person> violation = constraintViolations.iterator().next();
           assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
           assertThat(violation.getMessage()).isEqualTo("may not be empty");
   	}
    
    
    @Test
   	public void testShouldNotValidateWhenFirstNameEmpty24() {
       	LocaleContextHolder.setLocale(Locale.ENGLISH);
           Person person = new Person();
           person.setFirstName("");
           person.setLastName("smith");

           Validator validator = createValidator();
           Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

           assertThat(constraintViolations.size()).isEqualTo(1);
           ConstraintViolation<Person> violation = constraintViolations.iterator().next();
           assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
           assertThat(violation.getMessage()).isEqualTo("may not be empty");
   	}
    
    @Test
   	public void testShouldNotValidateWhenFirstNameEmpty26() {
       	LocaleContextHolder.setLocale(Locale.ENGLISH);
           Person person = new Person();
           person.setFirstName("");
           person.setLastName("smith");

           Validator validator = createValidator();
           Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

           assertThat(constraintViolations.size()).isEqualTo(1);
           ConstraintViolation<Person> violation = constraintViolations.iterator().next();
           assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
           assertThat(violation.getMessage()).isEqualTo("may not be empty");
   	}
    
    @Test
   	public void testShouldNotValidateWhenFirstNameEmpty260() {
       	LocaleContextHolder.setLocale(Locale.ENGLISH);
           Person person = new Person();
           person.setFirstName("");
           person.setLastName("smith");

           Validator validator = createValidator();
           Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

           assertThat(constraintViolations.size()).isEqualTo(1);
           ConstraintViolation<Person> violation = constraintViolations.iterator().next();
           assertThat(violation.getPropertyPath().toString()).isEqualTo("firstName");
           assertThat(violation.getMessage()).isEqualTo("may not be empty");
   	}


}
