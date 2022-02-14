public class Test {
    public void _tryMethod() {
			try{
        _get_delegate().release(this);
			} catch (ExceptionA|ExceptionB e){
				doSomething();
			} catch (SomeException e){
				doSomething();
			}
    }
}
