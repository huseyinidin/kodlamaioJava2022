package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	
		public void add(Product product) {
			
			//Only access codes to the database are written here.

			System.out.println("Added to database with Hibernate");
		}

}
