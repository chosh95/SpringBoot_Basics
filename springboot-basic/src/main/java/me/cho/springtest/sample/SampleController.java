package me.cho.springtest.sample;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hello")
    public EntityModel<Hello> hello(){
        Hello hello = new Hello();
        hello.setPrefix("Hey ");
        hello.setName("cho");

        EntityModel<Hello> helloEntityModel = new EntityModel<>(hello);
        helloEntityModel.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());
        return helloEntityModel;
    }
}
