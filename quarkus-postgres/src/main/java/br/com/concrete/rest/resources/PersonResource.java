package br.com.concrete.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.transaction.Transactional;

import javax.validation.Valid;

import java.util.List;

import br.com.concrete.domain.auth.Person;

@Path("/person/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @GET
    public List<Person> getPerson() {
        return Person.findAll().list();
    }

    @POST
    @Transactional
    public void addPerson(@Valid Person newPerson){
        newPerson.persist();
    }
}