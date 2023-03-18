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