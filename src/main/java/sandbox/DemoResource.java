package sandbox;

import sandbox.api.DemoApi;
import sandbox.model.DemoGet;
import sandbox.model.DemoPost;

import java.util.List;

public class DemoResource implements DemoApi {

    @Override
    public void addDemo(DemoPost demoPost) {

    }

    @Override
    public List<DemoGet> getDemo() {
        return List.of(new DemoGet().demo("demo"));
    }
}
