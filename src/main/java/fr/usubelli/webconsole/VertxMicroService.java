package fr.usubelli.webconsole;

import io.vertx.ext.auth.jwt.JWTAuth;
import io.vertx.ext.web.Router;

public interface VertxMicroService {

    void route(Router router, JWTAuth authProvider);

}
