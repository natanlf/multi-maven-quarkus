package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author leandrosoares
 */
@ApplicationScoped
public class ExampleRepository implements PanacheRepository<ExampleEntity> {


}
