public class Test {
    public void _methodRefs() {
			Function<A,B> function = AB::name;
			Function<A,B> function = this::name;
    }
}
