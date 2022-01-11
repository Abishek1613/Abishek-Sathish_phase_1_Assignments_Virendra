package program.jav.inner.classes;

public class Cars {
	
	    String carName;
	    String carType;

	    // assign values using constructor
	    public Cars(String name, String type) {
	        this.carName = name;
	        this.carType = type;
	    }

	    // private method
	    private String getCarsName() {
	        return this.carName;
	    }

	// inner class
	    void Engine(){
	    class Engine {
	        String engineType;
	        
	        void setEngine() {

	           // Accessing the carType property of Car
	            if(carType.equals("4WD")){

	                // Invoking method getCarName() of Car
	                if(getCarsName().equals("Crysler")) {
	                    engineType = "Smaller";
	                } else {
	                    engineType = "Bigger";
	                }

	            }else{
	               engineType = "Bigger";
	            }
	        }
	   
	        String getEngineType(){
	            return engineType;
	        }
	    }
	    
	    Engine engine = new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Engine c2engine = new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
	}
	   
	}

	class Main {
		
	    public static void main(String[] args) {

	// create an object of the outer class Car
	    
	        Cars car1 = new Cars("Mazda", "8WD");
	        
	        Cars car2 = new Cars ("Crysler", "4WD");


	      
	}
	
}
