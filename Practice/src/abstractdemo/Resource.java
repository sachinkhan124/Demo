package abstractdemo;

public class Resource {
	
	    // Constructor
	    public Resource() {
	        // Initialization code
	    }

	    // Overriding finalize method
	    @Override
	    protected void finalize() throws Throwable {
	        try {
	            System.out.println("Resource is being finalized.");
	            // Cleanup code
	        } finally {
	            super.finalize();
	        }
	    }

	    public static void main(String[] args) {
	        Resource resource = new Resource();
	        resource = null; // Make the resource eligible for garbage collection

	        // Suggest to the JVM to run the garbage collector
	        System.gc();

	        // Wait for a moment to allow GC to run (not guaranteed)
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}


