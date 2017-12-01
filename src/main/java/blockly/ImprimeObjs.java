package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ImprimeObjs {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ImprimeObjs
	public static Var mostrar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(
						cronapi.map.Operations.toList(Var.valueOf("{1=Carla, 2=Priscila}")).getObjectAsString());
				System.out.println(cronapi.map.Operations.createObjectMapWith(Var.valueOf("1", Var.valueOf("Carla2")),
						Var.valueOf("2", Var.valueOf("Priscila"))).getObjectAsString());
				System.out.println(cronapi.list.Operations.newList(Var.valueOf("Carla3"), Var.valueOf("Priscila"))
						.getObjectAsString());
				System.out.println(cronapi.map.Operations
						.toList(cronapi.map.Operations.createObjectMapWith(Var.valueOf("1", Var.valueOf("Carla4")),
								Var.valueOf("2", Var.valueOf("Priscila"))))
						.getObjectAsString());
				System.out.println(cronapi.list.Operations
						.newList(Var.valueOf("Carla5"),
								cronapi.map.Operations.createObjectMapWith(Var.valueOf("1", Var.valueOf("Carla4")),
										Var.valueOf("2", Var.valueOf("Priscila"))),
								Var.valueOf(0))
						.getObjectAsString());
				System.out.println(Var.valueOf("abc").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
