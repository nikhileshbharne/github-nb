public class SampleFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnGreeting() {
        testing.givenEvent().enqueue();
        testing.thenRun(SampleFunctionTest.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("Goodmorning, world!", result.getBodyAsString());
    }

}