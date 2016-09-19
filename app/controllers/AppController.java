package controllers;

/**
 * Created by cristian.schuszter on 9/19/2016.
 */

import com.cschuszter.models.MyEntity;
import com.cschuszter.services.EntityService;
import com.google.inject.Inject;
import lombok.Setter;
import play.libs.F;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;


public class AppController extends Controller {
    @Inject
    @Setter
    EntityService entityService;

    public Result index() {
        return ok(views.html.index.render("Hello, world! Welcome to my Play / Guice application.", null));
    }

    public F.Promise<Result> entities(boolean json) {
        return F.Promise.promise(() -> {
            Logger.info("Returning all entities from the service!");
            List<MyEntity> entities = entityService.getEntities();
            Logger.debug("Entities len: " + entities.size());
            if (json) {
                return ok(Json.toJson(entities));
            } else {
                return ok(views.html.index.render("Stored entities: ", entityService.getEntities()));
            }
        });
    }
}
