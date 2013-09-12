package com.obizware.test.tasteofguice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * Hello world!
 *
 */
public class App 
{
	@Inject
	HelloService helloService;
	
    public static void main( String[] args )
    {
    	App app = new App();
    	Module module = new HelloModule();
    	Injector injector = Guice.createInjector(module);
    	injector.injectMembers(app);
    	
    	app.sayHello();
    }
    
    private void sayHello(){
    	System.out.print(helloService.helloWorld("TamSeo"));
    }
}
