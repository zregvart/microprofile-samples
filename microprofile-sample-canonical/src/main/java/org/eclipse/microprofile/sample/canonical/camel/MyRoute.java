package org.eclipse.microprofile.sample.canonical.camel;

import org.apache.camel.builder.RouteBuilder;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:foo").to("log:hello");
    }
}
