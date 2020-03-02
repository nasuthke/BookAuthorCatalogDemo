package tk.cis.config;





import tk.cis.Ser.MyConfigSer;

//@Configuration
public class MyAppConfig {

	/*
	 * @Bean ("MyConfigSer")
	 * 
	 * @Profile("dev")
	 * 
	 * @ConfigurationProperties(prefix = "service")
	 */
	public MyConfigSer devConfigs() {
		System.out.println("inside MyAppConfig...");
		return new MyConfigSer();
	}
}
