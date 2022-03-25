package com.hendisantika.springdocapidemo2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 10.04
 * To change this template use File | Settings | File Templates.
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Doc API",
                description = "" +
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et rhoncus quam. Aenean quis augue ac eros pulvinar malesuada. " +
                        "In sagittis elit egestas tincidunt iaculis. " +
                        "Donec eu lacus vitae nulla varius consectetur a vel quam. Aliquam erat volutpat. Duis eget ullamcorper tellus",
                contact = @Contact(name = "Hendi Santika", url = "https://linktr.ee/hendisantika", email = "hendisantika@yahoo.co.id"),
                license = @License(name = "MIT Licence", url = "https://github.com/hendisantika/springdoc-api-demo2.git")),
        servers = @Server(url = "http://localhost:8080")
)
@SecurityScheme(name = "api", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
class OpenAPIConfiguration {
}
