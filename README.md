# repair-mart


#   @RequestBody 
    In sometime, Ram object will not getting deserialized properly. 
    You need to use the Ram parameter with @RequestBody to indicate that it should be deserialized from the request body:

    @RestController
    @RequestMapping("/ram")
    public class RamRestControllerImpl {

        @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Ram> createRam(@RequestBody Ram ram) {
            return ResponseEntity.ok(ramService.createRam(ram));
        }
    }

# @PathVariable

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ram> getRamById(@PathVariable Long id) {
        return ResponseEntity.ok(ramService.getRamById(id));
    }

    no need to send the L for the long in url. can use without L as http://localhost:8080/ram/3


# singleton pattern
    To create a singleton class we have several ways one of them as follows.
    
    (5)
    public final class InternalDatabase {
        (1)
        private InternalDatabase(){
        }
        
        (2)
        private static final class InternalDatabaseLazyLoader{
            (3)
            public static final InternalDatabase INSTANCE = new InternalDatabase();
        }
        (4)
        public static InternalDatabase getInstance(){
            return InternalDatabaseLazyLoader.INSTANCE;
        }
    }
 
    (1) - Keep the constructor as private. That will restrict to a single object
    (2) - Use a static class to create the one and only instance of the class 
    (3) - Create the single objct inside the static
    (4) - Create a static method to share the created single object.
    (5) - Better to keep the class as final otherwise if some class try to extend that class cannot acces the super constor

# @CrossOrigin
    - CORS is a security feature implemented by web browsers that restricts web pages from making requests to a different domain than the one that served the web page.
    - You need to configure your backend API server to allow cross-origin requests from your Angular application. 
    - You can do this by adding the @CrossOrigin annotation on your REST endpoint in your Spring controller.

    @CrossOrigin(origins = "http://localhost:4200")
    @RestController
    @RequestMapping("/ram")
    public class RamRestController {
    }